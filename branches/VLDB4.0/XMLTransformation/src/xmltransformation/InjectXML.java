package xmltransformation;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.engine.injectors.xml.XMLInjector;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.osgi.framework.Bundle;

public class InjectXML implements IObjectActionDelegate {
	private ISelection currSelection;
	IFile currentFile;

	/**
	 * The default constructor of the class.
	 *
	 * @generated
	 */
	public InjectXML() {
		super();
	}
	
	/**
	 * Launch the injector that converts a XML file to XML model.
	 * 
	 * @param action: IAction
	 *
	 * @generated
	 */
	@Override
	public void run(IAction action) {
		IStructuredSelection iss = (IStructuredSelection) currSelection;
		currentFile = (IFile) iss.getFirstElement();
		injector();
	}

	/**
	 * Loads the input XML file. Loads and registers the XML metamodel and generates 
	 * the XML output model that conforms to the metamodel.
	 *
	 * @generated
	 */
	private void injector() {
		
		Bundle b = Activator.getDefault().getBundle();

		try {
			IFile inFile = currentFile;
			InputStream in = inFile.getContents();

			AtlModelHandler amh = AtlModelHandler
					.getDefault(AtlModelHandler.AMH_EMF);
			ASMModel mof = amh.createModelLoader().getMOF();
			
			InputStream in_xml = FileLocator.openStream(b, new Path("/src/xmltransformation/resources/XML.ecore"), false);
				
			ASMModel xml_mm = amh.createModelLoader().loadModel("XML_MM", mof,
					in_xml);
			ASMModel model = amh.createModelLoader().newModel("XML_MODEL",
					inFile.getLocationURI().toString(), xml_mm);

			XMLInjector xmli = new XMLInjector();
			Map parameters = Collections.EMPTY_MAP;

			xmli.inject(model, in, parameters);
			in.close();
			in_xml.close();

			String name = inFile.getFullPath().toString();
			name = name.substring(0, name.length() - 4) + ".xmi"; 
			amh.createModelLoader().save(model, name);
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}

	/**
	 * Return the path of the file that is passed as parameter. 
	 * 
	 * @generated
	 */
	protected static String getFilePath(String name) throws IOException{
		
			String path=null;
			URL url = InjectXML.class.getResource(name);
			
			if (url != null) {
				path = FileLocator.resolve(url).getPath();
			}else{
				if(path==null){
					throw new IOException(name + ": not found");
				}
			}
            return path;
	}
}
