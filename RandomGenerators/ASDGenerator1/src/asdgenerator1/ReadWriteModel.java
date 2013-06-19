package asdgenerator1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ASD.*;


public class ReadWriteModel {
	
	public void modifyModel(String path, String path_out, int depth){
		
		ServiceDescription sd = this.loadModel(path);
		ArrayList <InfoType> itn = new ArrayList<InfoType>();
		ArrayList <InfoType> itf = new ArrayList<InfoType>();
		ArrayList <InfoType> itr = new ArrayList<InfoType>();
		ArrayList <InfoType> it = new ArrayList<InfoType>();
	    /* Choice if we add a Infotype into a Message or other InfoType
	     * 
	     * Message=0
	     * 
	     * Infotype=1
	     * 
	     */
		Random aleatorio = new Random();
		for (int i=0; i<depth; i++){	 
			int moi=aleatorio.nextInt(2);
			if (moi==1) {
				it=this.createListInfotype(sd,itf,itr,true);
				int num_info=aleatorio.nextInt(it.size());
				itn.add(this.createRandomInfoTypes(sd, i, moi, num_info,null,it));
			}else{
				it=this.createListInfotype(sd,itf,itr,true);
				ArrayList<Message> msgs=this.createListMessage(sd);
				int num_msg=aleatorio.nextInt(msgs.size());
				itn.add(this.createRandomInfoTypes(sd, i, moi, num_msg, msgs,it));
			}
		}
		this.assignValueType(itn,sd);
		this.checkValueTypePreviusIt(sd);
		this.saveModel(sd, path_out);
	}
	
	//Load model pass by parameters
	public  ServiceDescription loadModel(String path) {
		
		//Register model
		this.registerModel();
		
	    // Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();

	    // Get the resource
	    Resource resource = resSet.getResource(URI.createURI(path), true);
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	   
	    return (ServiceDescription) resource.getContents().get(0);
	}
	
	//Register the model
	public void registerModel() {
		
		// Initialize the model
		ASDPackage.eINSTANCE.eClass();
		
	    // Register the XMI resource factory for the .xmi extension

	    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	}
	
	//Traverse a model and keep all infotypes in an array except InfotypesImported 
	public ArrayList<InfoType> createListInfotype(ServiceDescription sd,ArrayList<InfoType> itf,ArrayList<InfoType> itr, Boolean first){
		
		if (first){
			Iterator<InfoType> iter = sd.getInfotypes().iterator();
			
			while (iter.hasNext()){
				InfoType aux = (InfoType) iter.next();
				if(aux.eClass().getName()!="InfoTypeImported"){
					itr.addAll(aux.getInfoType());
					itf.add(aux);
				}
			}
			if(!itr.isEmpty()){
				this.createListInfotype(null, itf, itr, false);
			}else{
				return itf;
			}
		}else{
			while(itr.size()!=0){
				if(!(itr.get(0).getInfoType().isEmpty())){
					itr.addAll(itr.get(0).getInfoType());
					itf.add(itr.get(0));
					itr.remove(0);
				}else{
					itf.add(itr.get(0));
					itr.remove(0);
				
				}
			}
			
		}
			return itf;
	}
	
	//Create a random infotype 
	public InfoType createRandomInfoTypes(ServiceDescription sd,int i, int moi, int ele, ArrayList<Message> msgs, ArrayList<InfoType> its) {
		
		
		// Retrieve the default factory singleton
	    ASDFactory factory = ASDFactory.eINSTANCE;
	    
	    //create infoTypes
	    InfoType it = factory.createInfoType();
	    
	    //Assign a new name that not exist before
	    this.AssignNameInfoType(it,its,i);
	   
	    if(moi==1){
	    	it.setSubset(its.get(ele).getSubset());
	    	its.get(ele).getInfoType().add(it);
	    }else{
			
			//Assign the same subset that the message container
			it.setSubset(msgs.get(ele).getSubset());
			
	    	it.getMessage().add(msgs.get(ele));
	    	sd.getInfotypes().add(it);
	    }
	    
	    return it;
	 } 
	
	//Assign a name to the InfoType. Check that not exist another InfoType with the same name 
	public InfoType AssignNameInfoType(InfoType it, ArrayList<InfoType> its, int i){
		
	
		boolean exit= false;
		boolean find= false;
		int aux=i+1;
		
		//Check if the name exist
	    while (!exit){
		    for (int j=0; j< its.size();j++){
		    	if (its.get(j).getName().contains("it"+aux)){
		    		find= false;
		    		break;
		    	}else{
		    		find=true;
		    	}
		    }
		    if (find){
		    	exit=true;
		    }else{
		    	aux++;
		    }
	    }
	    
	    //Assign a new name
	    it.setName("it"+aux);
	    
	    return it;
	}
	
	//Traverse a model and keep all messages in an array
	public ArrayList<Message> createListMessage(ServiceDescription sd){
		
		ArrayList <Message> msgs = new ArrayList<Message>();
		Iterator<Operation> iter = sd.getOperations().iterator();
		
		while (iter.hasNext())
		{
			Operation op = (Operation) iter.next();
			msgs.addAll(op.getContents());		
		}

		return msgs;
	}
	
	//Assign to an Infotype a random valueType 
	public void assignValueType(ArrayList<InfoType> it, ServiceDescription sd){
		
		Random aleatorio = new Random();
		
		for (int i=0; i<it.size();i++){
			
			int vt=aleatorio.nextInt(5);
			if (vt== 0){
				it.get(i).setValueType(EEnumValueType.STRING);
			}
			
			if (vt==1){
				it.get(i).setValueType(EEnumValueType.DATE);
			}
			
			if (vt==2){
				it.get(i).setValueType(EEnumValueType.DOUBLE);
			}
			
			if (vt==3){
				it.get(i).setValueType(EEnumValueType.FLOAT);
			}
			
			if (vt==4){
				it.get(i).setValueType(EEnumValueType.INT);
			}	
		}
	}
		
	//Check valueType feature of all infotypes is correct
	public void checkValueTypePreviusIt(ServiceDescription sd){
		ArrayList <InfoType> itf = new ArrayList<InfoType>();
		ArrayList <InfoType> itr = new ArrayList<InfoType>();
		ArrayList <InfoType> it = new ArrayList<InfoType>();
		
		it=this.createListInfotype(sd,itf,itr,true);
		
		for (int i=0; i<it.size();i++){
			if ((!(it.get(i).getInfoType().isEmpty()))&&(it.get(i).getValueType()!=EEnumValueType.DOCUMENT)){
				it.get(i).setValueType(EEnumValueType.DOCUMENT);
			}
		}
	}
	
	//Save the model in a output model called out.xmi
	public void saveModel(ServiceDescription sd, String path_out) {
	    
		// Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	
	    // Create a resource
	    Resource resource = resSet.createResource(URI.createURI(path_out));
	    
	    // Get the first model element and cast it to the right type, in my
	    // example everything is hierarchical included in this first node
	    resource.getContents().add(sd);
	
	    // Now save the content.
	    try {
	      resource.save(Collections.EMPTY_MAP);
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}
}
