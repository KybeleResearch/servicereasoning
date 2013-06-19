package asdgenerator2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ASD.*;

public class ReadWriteModel {

	public String modifyModel(String name,String path, int j){
				
		//Load the input model
		ServiceDescription sd = this.loadModel(path);
		
		//Obtain a random number 
		Random aleatorio = new Random();
		int mda;
		
		if (this.isRemoveOptionAvailable(sd)){
			mda=aleatorio.nextInt(3);
		}else{
			mda=aleatorio.nextInt(2);
		}
		
		ArrayList <InfoType> itn = new ArrayList<InfoType>();
		ArrayList <InfoType> itf = new ArrayList<InfoType>();
		ArrayList <InfoType> itr = new ArrayList<InfoType>();
		
		// if the random value is:
		// 0-Add a infotype of input model
		// 1-Modify a infotype of input model
		// 2-Remove a infotype of input model

		if(mda==0){
			//Create an array with all Infotypes of input model
			itn=this.createListInfotype(sd, itf, itr, true);
			
			this.addItModel(sd,itn);
		}else{
			
			//Create an array with all Infotypes of input model
			itn=this.createListInfotypeWithoutDocument(sd, itf, itr, true);	
			
			if(mda==1){
				//Choose a random Infotypes from array
				int ait=aleatorio.nextInt(itn.size());
				InfoType it = itn.get(ait);
				this.assignValueType(it, sd);
				if (it.eClass().getName()=="InfoTypeImported"){
					it.setName(it.getValueType().toString());
				}
			}else{
				int [] count= this.countInfoType(sd);
				
				if(!((count[0]>1)&&(count[1]>1))){
					for(int i=0;i<itn.size();i++){
						if(count[1]>1){
							if(itn.get(i).getSubset()==EEnumSubset.REQ){
								itn.remove(itn.get(i));
							}
						}else{
							if(itn.get(i).getSubset()==EEnumSubset.PRO){
								itn.remove(itn.get(i));
							}	
						}
					}
				}
			
				//Choose a random Infotypes from array
				int ait=aleatorio.nextInt(itn.size());
				InfoType it = itn.get(ait);
				this.deleteItModel(sd,it);
			}
		}
		
		String output_path=name.substring(0, name.length()-4)+"_out"+j+".xmi";
		
		//Create a new model which is a copy of input model but with some changes
		// (add,modify or remove a infotype)	
		this.saveModel(sd, output_path);
		
		return output_path;
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
	    ServiceDescription sd = (ServiceDescription) resource.getContents().get(0);
	    
	    return sd;
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
	
	//Return a boolean that mean if there are sufficient InfoTypes to be remove
	// option available
	public boolean isRemoveOptionAvailable(ServiceDescription sd){
		int [] count= this.countInfoType(sd);
		
		if((count[0]<=1)&&(count[1]<=1)){
			return false;
		}else{
			return true;
		}
	}
	
	//Count a InfoType with subset Req in position[0] and 
	//a InfoType with subset is Pro in position[1]
	public int[] countInfoType(ServiceDescription sd){
	
		ArrayList <InfoType> itn = new ArrayList<InfoType>();
		ArrayList <InfoType> itf = new ArrayList<InfoType>();
		ArrayList <InfoType> itr = new ArrayList<InfoType>();
		
		int [] count;
		count=new int[2];
		
		itn=this.createListInfotype(sd, itf, itr, true);
		itn.addAll(this.getInfotypeImported(sd));
		
		for(int i=0;i< itn.size();i++){
			if(itn.get(i).getSubset()==EEnumSubset.REQ){
				count[0]++;
			}else{
				count[1]++;
			}
		}
		
		return count;
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
	
	//Get an array with all InfoTypeImported of input model
	public ArrayList<InfoType> getInfotypeImported(ServiceDescription sd){
		ArrayList<InfoType>its= new ArrayList<InfoType>();
		
		for(int i=0;i<sd.getInfotypes().size();i++){
			if (sd.getInfotypes().get(i).eClass().getName()=="InfoTypeImported"){
				its.add(sd.getInfotypes().get(i));
			}
		}
		
		return its;
	}
	
	//Add a new infotype in the output model 
	private void addItModel(ServiceDescription sd, ArrayList<InfoType> itn) {
		
		// Choice if we add a Infotype into a Message or other InfoType:
	    // Message=0
	    // Infotype=1
	    
		Random aleatorio = new Random();
		int moi=aleatorio.nextInt(2);
		
		InfoType it;
		
		if (moi==1) {
			//Choose a random Infotypes from array
			int num_info=aleatorio.nextInt(itn.size());
			it=this.createRandomInfoTypes(sd, moi, num_info,null,itn);
		}else{
			ArrayList<Message> msgs=this.createListMessage(sd);
			int num_msg=aleatorio.nextInt(msgs.size());
			it=this.createRandomInfoTypes(sd, moi, num_msg, msgs,itn);
		}
		
		itn.add(it);
		this.assignValueType(it,sd);
		this.checkValueTypePreviusIt(sd, itn,0);
	}
	
	//Create a random infotype 
	public InfoType createRandomInfoTypes(ServiceDescription sd, int moi, int ele, ArrayList<Message> msgs, ArrayList<InfoType> its) {
		// Retrieve the default factory singleton
	    ASDFactory factory = ASDFactory.eINSTANCE;
	    
	    //create infoTypes
	    InfoType it = factory.createInfoType();
	    
	    //Assign a new name that not exist before
	    this.assignNameInfoType(it,its);
	       
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
	public InfoType assignNameInfoType(InfoType it, ArrayList<InfoType> its){
			
		boolean exit= false;
		boolean find= false;
		int aux=1;
		
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
	
	//Assign to an Infotype a random valueType 
	public void assignValueType(InfoType it, ServiceDescription sd){
		
		Random aleatorio = new Random();
		
		int vt=aleatorio.nextInt(5);
		if (vt== 0){
			it.setValueType(EEnumValueType.STRING);
		}
		
		if (vt== 1){
			it.setValueType(EEnumValueType.DATE);
		}
		
		if (vt== 2){
			it.setValueType(EEnumValueType.DOUBLE);
		}
		
		if (vt== 3){
			it.setValueType(EEnumValueType.FLOAT);
		}
		
		if (vt== 4){
			it.setValueType(EEnumValueType.INT);
		}
		
	}
	
	//Check valueType feature of all infotypes is correct
	public void checkValueTypePreviusIt(ServiceDescription sd, ArrayList<InfoType> itn, int option){
		for (int i=0; i<itn.size();i++){
			if(option==0){
				if ((!(itn.get(i).getInfoType().isEmpty()))&&(itn.get(i).getValueType()!=EEnumValueType.DOCUMENT)){
					itn.get(i).setValueType(EEnumValueType.DOCUMENT);
				}
			}else{
				if (((itn.get(i).getInfoType().isEmpty()))&&(itn.get(i).getValueType()==EEnumValueType.DOCUMENT)){
					this.assignValueType(itn.get(i), sd);
				}
			}
		}
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
	
	//Traverse a model and keep all infotypes in an array except Infotypes which his valueType
	//is different to the value Document
	public ArrayList<InfoType> createListInfotypeWithoutDocument(ServiceDescription sd,ArrayList<InfoType> itf,ArrayList<InfoType> itr, Boolean first){
		
		if (first){
			Iterator<InfoType> iter = sd.getInfotypes().iterator();
			
			while (iter.hasNext()){
				InfoType aux = (InfoType) iter.next();
				
				if(aux.getValueType()!= EEnumValueType.DOCUMENT){	
					itf.add(aux);
				}else{
					itr.addAll(aux.getInfoType());
				}
			}
			
			if(!itr.isEmpty()){
				this.createListInfotypeWithoutDocument(null, itf, itr, false);
			}else{
				return itf;
			}
		}else{
			while(itr.size()!=0){
				if(!(itr.get(0).getInfoType().isEmpty())){
					itr.addAll(itr.get(0).getInfoType());
					itr.remove(0);
				}else{
					itf.add(itr.get(0));
					itr.remove(0);
				}
			}
			
		}
		return itf;
	}
	
	//Get an array with all InfoType contained in a ServiceDescription which subset is Req
	public ArrayList<InfoType> getInfotypeReq(ServiceDescription sd){
		ArrayList<InfoType>its= new ArrayList<InfoType>();
		
		for(int i=0;i<sd.getInfotypes().size();i++){
			if (sd.getInfotypes().get(i).getSubset()==EEnumSubset.REQ){
				its.add(sd.getInfotypes().get(i));
			}
		}
		
		return its;	
	}

	//Get an array with all InfoType contained in a ServiceDescription which subset is Pro
	public ArrayList<InfoType> getInfotypePro(ServiceDescription sd){
		ArrayList<InfoType>its= new ArrayList<InfoType>();
		
		for(int i=0;i<sd.getInfotypes().size();i++){
			if (sd.getInfotypes().get(i).getSubset()==EEnumSubset.PRO){
				its.add(sd.getInfotypes().get(i));
			}
		}
		
		return its;	
	}
	
	//Delete the infotype choose
	private void deleteItModel(ServiceDescription sd,InfoType ele) {
		ArrayList <InfoType> itn = new ArrayList<InfoType>();
		ArrayList <InfoType> itf = new ArrayList<InfoType>();
		ArrayList <InfoType> itr = new ArrayList<InfoType>();
		
		if (ele.eContainer().eClass().getName()=="InfoType"){
			InfoType it=(InfoType) ele.eContainer();
			it.getInfoType().remove(ele);
		}else{
			sd.getInfotypes().remove(ele);
		}

		itn=this.createListInfotype(sd, itf, itr, true);
		this.checkValueTypePreviusIt(sd, itn,1);
		
		this.checkItMessage(sd, ele);
	}
	
	//Check if a message use the remove infotype and assign a random infotype a this message 
	public void checkItMessage(ServiceDescription sd, InfoType ele){
		ArrayList<Message>msgs=this.createListMessage(sd);
		ArrayList<InfoType>its= new ArrayList<InfoType>();
		Random aleatorio = new Random();
		int vt;
		
		for(int i=0;i<msgs.size();i++){
			if(msgs.get(i).getInfoType().contains(ele)){
				msgs.get(i).getInfoType().remove(ele);
				if(msgs.get(i).getSubset()==EEnumSubset.PRO){
					its=this.getInfotypePro(sd);
					
					vt=aleatorio.nextInt(its.size());
					msgs.get(i).getInfoType().add(its.get(vt));
				}else{
					its=this.getInfotypeReq(sd);
					
					vt=aleatorio.nextInt(its.size());
					msgs.get(i).getInfoType().add(its.get(vt));
				}
			}
		}
	}

	//Save the model in a output model called out.xmi
	public void saveModel(ServiceDescription sd, String path) {
	    
		// Obtain a new resource set
	    ResourceSet resSet = new ResourceSetImpl();
	
	    // Create a resource
	    Resource resource = resSet.createResource(URI.createURI(path));
	    
	    
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
		