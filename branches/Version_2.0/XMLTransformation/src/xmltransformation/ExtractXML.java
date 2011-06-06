package xmltransformation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.Map;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2m.atl.engine.extractors.xml.XMLExtractor;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.engine.vm.nativelib.ASMModel;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;


public class ExtractXML implements IObjectActionDelegate {
	private ISelection currSelection;
	IFile currentFile;

	/**
	 * The default constructor of the class.
	 *
	 * @generated
	 */
	public ExtractXML() {
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
		extractor();
	}

	/**
	 * Loads the input XML model and the XML metamodel and generates the XML output 
	 * file.
	 *
	 * @generated
	 */
	private void extractor() {
		
		String xml_path;

		try {
			IFile inFile = currentFile;
			IFile outFile;
			
			AtlModelHandler amh = AtlModelHandler
					.getDefault(AtlModelHandler.AMH_EMF);
			ModelLoader ml = amh.createModelLoader();
			ASMModel mof = ml.getMOF();
			xml_path =getFilePath("resources/XML.ecore");

			InputStream in_xml = new FileInputStream(xml_path);
			ASMModel xml_mm = ml.loadModel("XML_MM", mof,
					in_xml);
			
			final ASMModel xmlmodel = ml.loadModel(inFile.getName(),xml_mm,
					inFile.getContents());
			
			PipedInputStream in = new PipedInputStream();
			final OutputStream out = new PipedOutputStream(in);
			

			final XMLExtractor xmli = new XMLExtractor();
			final Map parameters = Collections.EMPTY_MAP;

			new Thread() {
				public void run() {
					try {
						xmli.extract(xmlmodel, out, parameters);
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						try {
							out.close();
						} catch (IOException ioe) {

						}
					}
				}
			}.start();
			String name = inFile.getFullPath().toString();
			name = name.substring(0,name.indexOf(".")) + ".xml";
			IWorkspace wks = ResourcesPlugin.getWorkspace();
			IWorkspaceRoot wksroot = wks.getRoot();
			outFile = wksroot.getFile(new Path(name));
			
			if (outFile.exists())
				outFile.setContents(in, IFile.FORCE, null);
			else
				outFile.create(in, IFile.FORCE, null);
	
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Return the path of the file that is passed as parameter. 
	 * 
	 * @generated
	 */
	protected static String getFilePath(String name) throws IOException{
		
		String path=null;
		URL url = ExtractXML.class.getResource(name);
		
		if (url != null) {
			path = FileLocator.resolve(url).getPath();
		}else{
			if(path==null){
				throw new IOException(name + ": not found");
			}
		}
        return path;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		currSelection = selection;
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {

	}	
}
