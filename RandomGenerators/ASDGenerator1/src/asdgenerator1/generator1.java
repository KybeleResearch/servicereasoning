package asdgenerator1;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;





public class generator1 implements IObjectActionDelegate {
	private ISelection currSelection;
	IFile currentFile;

	/**
	 * The default constructor of the class.
	 *
	 * @generated
	 */
	public generator1() {
		super();
	}

	/**
	 * Launch the extractor that converts a XML model to XML file.
	 * 
	 * @param action: IAction
	 *
	 * @generated
	 */
	@Override
	public void run(IAction action) {
		
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		String path_in=currentFile.getFullPath().toString();
		generatorForm gf=new generatorForm(path_in);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		gf.setLocation((d.width/2)-(gf.getWidth()/2),200);
		gf.setVisible(true); 
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}	
}
