import java.util.ArrayList;
import java.util.List;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import wsdlv2_0.Activator;


public class XML2WSDLLaunchShortcut implements ILaunchShortcut {
	
	public static final String MODEL_CONFIGTYPE_ID = Activator.PLUGIN_ID + ".XML2WSDLv2_0_lct";

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sSelection = (IStructuredSelection)selection;
			if (sSelection.size() == 1)	{ // Si hemos seleccionado un fichero nada mas
				Object object = sSelection.getFirstElement();
				if (object instanceof IFile)
					searchAndLaunch(((IFile)object).getLocation().toOSString(), mode);
				}
			}		
	}

	@Override
	public void launch(IEditorPart editor, String mode) {

	}
	
	protected void searchAndLaunch(String pathIN, String mode) {		
		ILaunchConfigurationType type = getConfigurationType();

		try {
			int previousCount = getLaunchManager().getLaunchConfigurations(type).length;
			ILaunchConfiguration config = findLaunchConfiguration(pathIN, getConfigurationType());
			int newCount = getLaunchManager().getLaunchConfigurations(type).length;
			
			if (previousCount != newCount) {	// Si hemos creado una nueva configuracion

				DebugUITools.openLaunchConfigurationDialog(getShell(), config, DebugUITools.getLaunchGroup(config, mode).getIdentifier(), null);
			}
			else {	// Si hemos elegido una anterior => lanzamos
				DebugUITools.launch(config, mode);
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 		
	}
	
	protected ILaunchConfigurationType getConfigurationType() {
		 return getLaunchManager().getLaunchConfigurationType(MODEL_CONFIGTYPE_ID);
	}
	
	protected ILaunchManager getLaunchManager() {
		return DebugPlugin.getDefault().getLaunchManager();	
	}
	
	protected ILaunchConfiguration findLaunchConfiguration(String pathIN, ILaunchConfigurationType configType) {

		List<ILaunchConfiguration> candidateConfigs = null;
		try {
			ILaunchConfiguration[] configs = getLaunchManager().getLaunchConfigurations(configType);
			candidateConfigs = new ArrayList<ILaunchConfiguration>(configs.length);
			for (int i = 0; i < configs.length; i++) {
				ILaunchConfiguration config = configs[i];
				if (config.getAttribute("inModel", "").equals(pathIN)) { 
					candidateConfigs.add(config);
				}
			}
		} catch (CoreException e) {
			DebugPlugin.log(e);
		}
		
		// If there are no existing configs associated with the IType, create one.
		// If there is exactly one config associated with the IType, return it.
		// Otherwise, if there is more than one config associated with the IType, prompt the
		// user to choose one.
		int candidateCount = candidateConfigs.size();
		if (candidateCount < 1) {
			return createConfiguration(pathIN);
		} else if (candidateCount == 1) {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		} else {
			// Prompt the user to choose a config.  A null result means the user
			// cancelled the dialog, in which case this method returns null,
			// since cancelling the dialog should also cancel launching anything.
			ILaunchConfiguration config = chooseConfiguration(candidateConfigs);
			if (config != null) {
				return config;
			}
		}
		return null;
	}
	
	public static Shell getShell() {
		
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}
	
	protected ILaunchConfiguration createConfiguration(String pathIN) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName("New_configuration"));
			wc.setAttribute("inModel", pathIN);
			wc.setAttribute("outModel", new Path(pathIN).removeFileExtension().toOSString() + "-wsdlv2.xmi");
			config = wc.doSave();
		} catch (CoreException exception) {
			System.out.println("Error en createConfiguration");
			DebugPlugin.log(exception);	
		} 
		return config;
	}
	
	/**
	 * Show a selection dialog that allows the user to choose one of the specified
	 * launch configurations.  Return the chosen config, or <code>null</code> if the
	 * user cancelled the dialog.
	 */
	protected ILaunchConfiguration chooseConfiguration(List<ILaunchConfiguration> configList) {
		IDebugModelPresentation labelProvider = DebugUITools.newDebugModelPresentation();
		ElementListSelectionDialog dialog= new ElementListSelectionDialog(getShell(), labelProvider);
		dialog.setElements(configList.toArray());
		dialog.setTitle("Select a configuration");  
		dialog.setMessage("Select a compatible configuration");
		dialog.setMultipleSelection(false);
		int result = dialog.open();
		labelProvider.dispose();
		if (result == Window.OK) {
			return (ILaunchConfiguration) dialog.getFirstResult();
		}
		return null;		
	}
}
