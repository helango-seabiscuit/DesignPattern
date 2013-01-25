package Command;

public class LightOffCommand implements Command{
	
	Light light;
	
	public LightOffCommand(Light light){
		setLight(light);
	}
	
	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public void execute(){
		light.off();
	}

}
