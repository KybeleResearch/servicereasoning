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


import serviceannotator.Activator;


public class SALaunchShortcut implements ILaunchShortcut {
	
	public static final String MODEL_CONFIGTYPE_ID = Activator.PLUGIN_ID + ".SA_lct";

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection sSelection = (IStructuredSelection)selection;
			if (sSelection.size() == 2){ // Si hemos seleccionado dos fichero nada mas
				Object[] object = sSelection.toArray();
				if ((object[0] instanceof IFile) && (object[1] instanceof IFile)){
					LaunchTransformation(((IFile)object[0]).getLocation().toOSString(),((IFile)object[1]).getLocation().toOSString(), mode);
				}
			}
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {

	}
	
	protected void LaunchTransformation(String pathIN,String pathIN2, String mode) {		
		ILaunchConfiguration config = createConfiguration(pathIN, pathIN2);
		DebugUITools.openLaunchConfigurationDialog(getShell(), config, DebugUITools.getLaunchGroup(config, mode).getIdentifier(), null);
	}
	
	protected ILaunchConfigurationType getConfigurationType() {
		 return getLaunchManager().getLaunchConfigurationType(MODEL_CONFIGTYPE_ID);
	}
	
	protected ILaunchManager getLaunchManager() {
		return DebugPlugin.getDefault().getLaunchManager();	
	}
	
	
	public static Shell getShell() {
		
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}
	
	protected ILaunchConfiguration createConfiguration(String pathIN, String pathIN2) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getConfigurationType();
			wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName("New_configuration"));
			wc.setAttribute("sourceModel", pathIN);
			wc.setAttribute("targetModel", pathIN2);
			wc.setAttribute("annotatedModel", new Path(pathIN).removeFileExtension().toOSString() + "-SA.xmi");
			config = wc.doSave();
		} catch (CoreException exception) {
			System.out.println("Error en createConfiguration");
			DebugPlugin.log(exception);	
		} 
		return config;
	}
}
