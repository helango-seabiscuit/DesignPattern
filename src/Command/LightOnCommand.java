package Command;

public class LightOnCommand implements Command{
	Light light;
	
	public LightOnCommand(Light light){
		setLight(light);
	}
	
	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public void execute(){
		light.on();
	}
	

}
