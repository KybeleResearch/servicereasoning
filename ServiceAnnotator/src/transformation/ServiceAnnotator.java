package transformation;

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
import org.eclipse.m2m.atl.common.ATLExecutionException;
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

/**
 * Entry point of the 'ServiceMatcherV3' transformation module.
 */
public class ServiceAnnotator {

	/**
	 * The property file. Stores module list, the metamodel and library locations.
	 * @generated
	 */
	private Properties properties;
	
	/**
	 * The Source model.
	 * @generated
	 */
	protected IModel sourceModel;	
	
	/**
	 * The Target model.
	 * @generated
	 */
	protected IModel targetModel;	
	
	/**
	 * The Annotated model.
	 * @generated
	 */
	protected IModel annotatedModel;	
		
	/**
	 * The main method.
	 * 
	 * @param args
	 *            are the arguments
	 * @generated
	 */
	public void SA(String in,String in2, String out) throws Exception{
		ServiceAnnotator runner = new ServiceAnnotator();
		runner.loadModels(in,in2);
		long initTime=System.currentTimeMillis();
		runner.doServiceAnnotator(new NullProgressMonitor());
		long finishTime=System.currentTimeMillis();
		long executionTime=finishTime-initTime;
		System.out.println("The execution time: "+executionTime+" ms" );
		runner.saveModels(out);	
	}

	/**
	 * Constructor.
	 *
	 * @generated
	 */
	public ServiceAnnotator() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("ServiceAnnotator.properties").openStream());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}
	
	/**
	 * Load the input and input/output models, initialize output models.
	 * 
	 * @param provModelPath
	 *            the Source model path
	 * @param consModelPath
	 *            the Target model path
	 * @throws ATLCoreException
	 *             if a problem occurs while loading models
	 *
	 * @generated
	 */
	public void loadModels(String sourceModelPath, String targetModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
	 	IReferenceModel asdMetamodel = factory.newReferenceModel();
		try {
			injector.inject(asdMetamodel,getFileURL("Metamodel/ASD.ecore").toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.sourceModel = factory.newModel(asdMetamodel);
		injector.inject(sourceModel, sourceModelPath);
		this.targetModel = factory.newModel(asdMetamodel);
		injector.inject(targetModel, targetModelPath);
		this.annotatedModel = factory.newModel(asdMetamodel);
	}
	
	/**
	 * Save the output and input/output models.
	 * 
	 * @param contractModelPath
	 *            the Annotated model path
	 * @throws ATLCoreException
	 *             if a problem occurs while saving models
	 *
	 * @generated
	 */
	public void saveModels(String annotatedModelPath) throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(annotatedModel, annotatedModelPath);
	}

	/**
	 * Transform the models.
	 * 
	 * @param monitor
	 *            the progress monitor
	 * @throws ATLCoreException
	 *             if an error occurs during models handling
	 * @throws IOException
	 *             if a module cannot be read
	 * @throws ATLExecutionException
	 *             if an error occurs during the execution
	 *
	 * @generated
	 */
	public Object doServiceAnnotator(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(sourceModel, "Source", "ASD");
		launcher.addInModel(targetModel, "Target", "ASD");
		launcher.addOutModel(annotatedModel, "AnnotatedASD", "ASD");
		return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
	}
	
	/**
	 * Returns an Array of the module input streams, parameterized by the
	 * property file.
	 * 
	 * @return an Array of the module input streams
	 * @throws IOException
	 *             if a module cannot be read
	 *
	 * @generated
	 */
	protected InputStream[] getModulesList() throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("ServiceAnnotator.modules");
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
	
	/**
	 * Returns the URI of the given metamodel, parameterized from the property file.
	 * 
	 * @param metamodelName
	 *            the metamodel name
	 * @return the metamodel URI
	 *
	 * @generated
	 */
	protected String getMetamodelUri(String metamodelName) {
		return properties.getProperty("ServiceAnnotator.metamodels." + metamodelName);
	}
	
	/**
	 * Returns the file name of the given library, parameterized from the property file.
	 * 
	 * @param libraryName
	 *            the library name
	 * @return the library file name
	 *
	 * @generated
	 */
	protected InputStream getLibraryAsStream(String libraryName) throws IOException {
		return getFileURL(properties.getProperty("ServiceAnnotator.libraries." + libraryName)).openStream();
	}
	
	/**
	 * Returns the options map, parameterized from the property file.
	 * 
	 * @return the options map
	 *
	 * @generated
	 */
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("ServiceAnnotator.options.")) {
				options.put(entry.getKey().toString().replaceFirst("ServiceAnnotator.options.", ""), 
				entry.getValue().toString());
			}
		}
		return options;
	}
	
	/**
	 * Finds the file in the plug-in. Returns the file URL.
	 * 
	 * @param fileName
	 *            the file name
	 * @return the file URL
	 * @throws IOException
	 *             if the file doesn't exist
	 * 
	 * @generated
	 */
	protected static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = ServiceAnnotator.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = ServiceAnnotator.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	/**
	 * Tests if eclipse is running.
	 * 
	 * @return <code>true</code> if eclipse is running
	 *
	 * @generated
	 */
	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}
