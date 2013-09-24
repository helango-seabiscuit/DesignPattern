package Command.DocumentCommandImpl;


//Receiver Object
public class Document {
	
	String name;
	
	Document(String name){
		this.name = name;
	}
	
	public boolean open(){
		System.out.println("Document opened");
		return true;
	}
	
	public boolean close(){
		System.out.println("Document closed");
		return true;
	}
	
	public boolean save(){
		System.out.println("Document saved");
		return true;
	}

}
