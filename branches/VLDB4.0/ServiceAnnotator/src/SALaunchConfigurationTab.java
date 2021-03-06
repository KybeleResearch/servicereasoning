import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;


public class SALaunchConfigurationTab extends AbstractExtendedLaunchConfigurationTab {

	private ScrolledComposite sc = null;
	private Composite modelExtentComp = null;	
	private Text tProviderTextIN;
	private Text tProviderTextIN2;
	private Text tProviderTextOUT;
	
	private class TProviderGroupListener extends SelectionAdapter implements ModifyListener {
		
		int type;
		public void widgetSelected (SelectionEvent e) {
				
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell()
											, getLabelProvider()
											, getTreeContentProvider());
			dialog.setTitle("Select a valid model");
			dialog.setAllowMultiple(false);	
			dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());				
			
			if (dialog.open() == Window.OK) {
				Object o = dialog.getFirstResult();
				String path = "";
				if(o instanceof IFile)
					path = ((IFile)dialog.getFirstResult()).getLocation().toOSString();
				if(o instanceof IFolder)	
					path = ((IFolder)dialog.getFirstResult()).getLocation().toOSString();
				
				switch(type)
				{
				case(0):if (!tProviderTextIN.getText().equals(path))tProviderTextIN.setText(path);break;
				case(1):if (!tProviderTextIN2.getText().equals(path))tProviderTextIN2.setText(path);break;
				case(2):if (!tProviderTextOUT.getText().equals(path))tProviderTextOUT.setText(path);break;
				}
				
			}
		}
		
		public TProviderGroupListener(int type) {
			this.type = type;
		}

		public void modifyText(ModifyEvent e) {
 
			updateLaunchConfigurationDialog();
			
		}

	}
	
	@Override
	protected void updateLaunchConfigurationDialog() {

		 IPath orLoc = getASDLocation();
		   if (orLoc == null || !orLoc.toFile().exists() || (!orLoc.getFileExtension().equals("xmi")&& !orLoc.getFileExtension().equals("ecore")
				   && !orLoc.getFileExtension().equals("asd"))) {
		      setMessage(null);
		      setErrorMessage("Select a valid ASD file");
		      super.updateLaunchConfigurationDialog();
		      return;
		   }
		   
		   IPath orLoc2 = getASDLocation2();
		   if (orLoc2 == null || !orLoc2.toFile().exists() || (!orLoc2.getFileExtension().equals("xmi")&& !orLoc2.getFileExtension().equals("ecore")
				   && !orLoc2.getFileExtension().equals("asd"))) {
		      setMessage(null);
		      setErrorMessage("Select a valid ASD file");
		      super.updateLaunchConfigurationDialog();
		      return;
		   }
		   
		   
		   IPath destinationLoc = getDestinationLocation();
		   if (destinationLoc == null || (!destinationLoc.getFileExtension().equals("xmi")&& !destinationLoc.getFileExtension().equals("ecore")
				&& !destinationLoc.getFileExtension().equals("asd"))) {
		      setMessage(null);
		      setErrorMessage(
		         "Select a valid output model");
		      super.updateLaunchConfigurationDialog();
		      return;
		   }
		   	  setMessage(null);
		      setErrorMessage(null);
		      super.updateLaunchConfigurationDialog();
	}
	
	@Override
	public void createControl(Composite parent) {

		setMessage("Launching configuration for a model to model transformation");
		
		sc = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.H_SCROLL | SWT.BORDER);
		sc.setExpandHorizontal(true);
		sc.setExpandVertical(true);
		
				
		modelExtentComp = new Composite(sc, SWT.NONE);
		sc.setContent(modelExtentComp);		

		GridLayout topLayOut = new GridLayout(1, true);
		topLayOut.verticalSpacing = 10;
		modelExtentComp.setLayout(topLayOut);
		modelExtentComp.setFont(parent.getFont());
		
		setControl(sc);
			
		Group tProviderGroup = createGroup(modelExtentComp, "Source ASD model", 3);
		TProviderGroupListener tProviderListener = new TProviderGroupListener(0);
		createLabel(tProviderGroup, "ASD Model: ");		
		tProviderTextIN = createText(tProviderGroup);		
		tProviderTextIN.addModifyListener(tProviderListener);
		Button tProviderBrowse = createPushButton(tProviderGroup, "Browse...", null);		
		tProviderBrowse.addSelectionListener(tProviderListener);
		
		Group tProviderGroup3 = createGroup(modelExtentComp, "Target ASD model", 3);
		TProviderGroupListener tProviderListener3 = new TProviderGroupListener(1);
		createLabel(tProviderGroup3, "ASD Model: ");		
		tProviderTextIN2 = createText(tProviderGroup3);		
		tProviderTextIN2.addModifyListener(tProviderListener3);
		Button tProviderBrowse3 = createPushButton(tProviderGroup3, "Browse...", null);		
		tProviderBrowse3.addSelectionListener(tProviderListener3);
		
		Group tProviderGroup2 = createGroup(modelExtentComp, "Annotated ASD Model", 3);
		TProviderGroupListener tProviderListener2 = new TProviderGroupListener(2);
		createLabel(tProviderGroup2, "ASD Model: ");		
		tProviderTextOUT = createText(tProviderGroup2);		
		tProviderTextOUT.addModifyListener(tProviderListener2);
		Button tProviderBrowse2 = createPushButton(tProviderGroup2, "Browse...", null);		
		tProviderBrowse2.addSelectionListener(tProviderListener2);

		sc.setMinSize(modelExtentComp.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute("sourceModel", "");
		configuration.setAttribute("targetModel", "");
		configuration.setAttribute("annotatedModel", "");
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			tProviderTextIN.setText(configuration.getAttribute(
					"sourceModel", ""));
		} catch (CoreException ce) {
			tProviderTextIN.setText("");
		}	
		try {
			tProviderTextIN2.setText(configuration.getAttribute(
					"targetModel", ""));
		} catch (CoreException ce) {
			tProviderTextIN2.setText("");
		}	
		try {
			tProviderTextOUT.setText(configuration.getAttribute(
					"annotatedModel", ""));
		} catch (CoreException ce) {
			tProviderTextOUT.setText("");
		}	
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		String in = getAttributeValueFrom(tProviderTextIN);
		String in2 = getAttributeValueFrom(tProviderTextIN2);
		String out = getAttributeValueFrom(tProviderTextOUT);
		configuration.setAttribute("sourceModel", in);
		configuration.setAttribute("targetModel", in2);
		configuration.setAttribute("annotatedModel", out);
		
	}

	@Override
	public String getName() {
		return "Models";
	}
	
	protected ITreeContentProvider getTreeContentProvider() {
		
		return  new BaseWorkbenchContentProvider();	
	}
	
	protected ILabelProvider getLabelProvider() {
		return new WorkbenchLabelProvider();
	}
	
	public IPath getASDLocation() {
		   String text = tProviderTextIN.getText().trim();
		   if (text.length() == 0)
		       return null;
		   IPath path = new Path(text);
		   if (!path.isAbsolute())
		      path = ResourcesPlugin.getWorkspace().getRoot().getLocation()
		             .append(path);
		   return path;
		}
	
	public IPath getASDLocation2() {
		   String text = tProviderTextIN2.getText().trim();
		   if (text.length() == 0)
		       return null;
		   IPath path = new Path(text);
		   if (!path.isAbsolute())
		      path = ResourcesPlugin.getWorkspace().getRoot().getLocation()
		             .append(path);
		   return path;
		}
			
		public IPath getDestinationLocation() {
		   String text = tProviderTextOUT.getText().trim();
		   if (text.length() == 0)
		       return null;
		   IPath path = new Path(text);
		   if (!path.isAbsolute())
		      path = ResourcesPlugin.getWorkspace().getRoot().getLocation()
		             .append(path);
		   return path;
		}		
		
	protected String getAttributeValueFrom (Text text) {
			
			String content = text.getText().trim();
			if (content.length() > 0) {
				return content;
			}
			return null;
		}
}
