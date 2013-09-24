package Command.LightCommandImpl;


//RECEIVER object
public class Light {
	private String name;
	
	public Light(String name){
		this.name=name;
	}
	
	public void on(){
		System.out.println(name +" is On");
		
	}
	
	public void off(){
		System.out.println(name +" is Off");
		
	}

}
