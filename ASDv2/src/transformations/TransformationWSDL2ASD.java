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

import asdv2.Activator;

public class TransformationWSDL2ASD {
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
	
	public void WSDL2ASD(String in, String out) throws Exception{
		loadProperties();
		loadModels(in);
		execution(new NullProgressMonitor());
		saveModels(out);
		
		
		Bundle b = Activator.getDefault().getBundle();
		InputStream input = FileLocator.openStream(b, new Path("/src/transformations/Metamodels/ASD.ecore"), false);
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
		launcher.addInModel(inModel, "IN", "WSDL");
		launcher.addOutModel(outModel, "OUT", "ASD");
		launcher.addLibrary("ASDHelpersv2", getLibraryAsStream("ASDHelpers"));
		return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
		
	}

	private void loadModels(String in) throws ATLCoreException, IOException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel wsdlMetamodel = factory.newReferenceModel();
		injector.inject(wsdlMetamodel, getFileURL("Metamodels/wsdl2_0.ecore").toString());
	 	IReferenceModel asdMetamodel = factory.newReferenceModel();
		injector.inject(asdMetamodel, getFileURL("Metamodels/ASD.ecore").toString());
		this.inModel = factory.newModel(wsdlMetamodel);
		injector.inject(inModel, in);
		this.outModel = factory.newModel(asdMetamodel);
	}

	private void loadProperties() throws Exception {
		properties = new Properties();
		properties.load(getFileURL("WSDL2ASDv2.properties").openStream());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());	
	}
	
	protected InputStream[] getModulesList() throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("WSDL2ASDv2.modules");
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
		return properties.getProperty("WSDL2ASDv2.metamodels." + metamodelName);
	}
	
	
	protected InputStream getLibraryAsStream(String libraryName) throws IOException {
		return getFileURL(properties.getProperty("WSDL2ASDv2.libraries." + libraryName)).openStream();
	}
	
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("WSDL2ASDv2.options.")) {
				options.put(entry.getKey().toString().replaceFirst("WSDL2ASDv2.options.", ""), 
				entry.getValue().toString());
			}
		}
		return options;
	}
	
	protected static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = TransformationWSDL2ASD.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = TransformationWSDL2ASD.class.getResource(fileName);
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
