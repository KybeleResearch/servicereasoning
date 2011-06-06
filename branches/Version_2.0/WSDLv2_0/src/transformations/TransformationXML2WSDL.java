package transformations;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.osgi.framework.Bundle;

import wsdlv2_0.Activator;

public class TransformationXML2WSDL {

	/**
	 * The property file. Stores module list, the metamodel and library locations.
	 * @generated
	 */
	private Properties properties;
	
	/**
	 * The IN model.
	 * @generated
	 */
	protected IModel inModel;	
	
	/**
	 * The OUT model.
	 * @generated
	 */
	protected IModel outModel;	
	
	public void XML2WSDL(String in, String out) throws Exception{
		loadProperties();
		loadModels(in);
		execution(new NullProgressMonitor());
		saveModels(out);
		
		
		Bundle b = Activator.getDefault().getBundle();
		InputStream input = FileLocator.openStream(b, new Path("/src/transformations/Metamodels/wsdl2_0.ecore"), false);
		input.close();
	}

	private void saveModels(String outModelPath)  throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(outModel, outModelPath);
		
	}

	private Object execution(IProgressMonitor monitor) throws Exception {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(inModel, "IN", "XML");
		launcher.addOutModel(outModel, "OUT", "WSDL");
		launcher.addLibrary("XMLHelpersv2", getLibraryAsStream("XMLHelpers"));
		return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
		
	}

	private void loadModels(String in) throws ATLCoreException, IOException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel wsdlMetamodel = factory.newReferenceModel();
		injector.inject(wsdlMetamodel, getFileURL("Metamodels/wsdl2_0.ecore").toString());
	 	IReferenceModel xmlMetamodel = factory.newReferenceModel();
		injector.inject(xmlMetamodel, getFileURL("Metamodels/XML.ecore").toString());
		this.inModel = factory.newModel(xmlMetamodel);
		injector.inject(inModel, in);
		this.outModel = factory.newModel(wsdlMetamodel);
	}

	private void loadProperties() throws Exception {
		properties = new Properties();
		properties.load(getFileURL("XML2WSDLv2.properties").openStream());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());	
	}
	
	protected InputStream[] getModulesList() throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("XML2WSDLv2.modules");
		if (modulesList != null) {
			String[] moduleNames = modulesList.split(",");
			modules = new InputStream[moduleNames.length];
			for (int i = 0; i < moduleNames.length; i++) {
				String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
				modules[i] = getFileURL(asmModulePath).openStream();
			}
		}
		return modules;
	}
	
	protected String getMetamodelUri(String metamodelName) {
		return properties.getProperty("XML2WSDLv2.metamodels." + metamodelName);
	}
	
	protected InputStream getLibraryAsStream(String libraryName) throws IOException {
		return getFileURL(properties.getProperty("XML2WSDLv2.libraries." + libraryName)).openStream();
	}
	
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("XML2WSDLv2.options.")) {
				options.put(entry.getKey().toString().replaceFirst("XML2WSDLv2.options.", ""), 
				entry.getValue().toString());
			}
		}
		return options;
	}
	
	protected static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = TransformationXML2WSDL.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = TransformationXML2WSDL.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}
