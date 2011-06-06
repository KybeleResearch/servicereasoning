import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import transformations.TransformationWSDL2ASD;


public class WSDL2ASDLaunchConfigurationDelegate implements
ILaunchConfigurationDelegate  {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e1) {
			;
		}		
				
		if (monitor == null)
			monitor = new NullProgressMonitor();		
		
		monitor.beginTask("Launching transformation", 100);
		monitor.subTask("Getting configuration info");
		String in = getINAtt(configuration);
		File fin=new File(in);
		String uriIN=fin.toURI().toString();
		String out = getOUTAtt(configuration);
		File fout=new File(out);
		String uriOUT=fout.toURI().toString();
		
		monitor.worked(10);
		if (monitor.isCanceled()) 
			return;
		
		monitor.subTask("Executing transformation");
		try{
			TransformationWSDL2ASD transf = new TransformationWSDL2ASD();
			transf.WSDL2ASD(uriIN, uriOUT);
			monitor.worked(85);		
			if(monitor.isCanceled())
				return;
		}catch (Exception e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "One or more models cannot be found.\nPlease, check your Launch Configuration", "Problems Launching...", JOptionPane.ERROR_MESSAGE);
		}
		monitor.subTask("Transformation finished");
		ResourcesPlugin.getWorkspace().getRoot().refreshLocal(IFolder.DEPTH_INFINITE, null);
		monitor.done();
		
	}

	private String getINAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, "inModel");
	}
	
		
	private String getOUTAtt(ILaunchConfiguration configuration) throws CoreException
	{
		return getTransformationAtt(configuration, "outModel");
	}
	
	private String getTransformationAtt(ILaunchConfiguration configuration,String id) throws CoreException{
		
		String returned = null;

		returned = configuration.getAttribute(id, (String)null);

		return returned;
	}

}
