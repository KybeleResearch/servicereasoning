import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;


public class LiberantASDLaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
			
			ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] {
					new LiberantASDLaunchConfigurationTab(),
					new CommonTab()
			};
			setTabs(tabs);		
		}

}