package Command.LightCommandImpl;


//Client Object 
public class RemoteLoader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteControl remoteControl=new RemoteControl();
		Light livingRoomLight=new Light("LivingRoom");
		Light kitchenLight=new Light("Kitchen");
		//CeilingFan ceilingFan=new CeilingFan("Living Room");
		//GarageDoor garageDoor=new GarageDoor("");
		//Stereo stereo=new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn=new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff=new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenRoomLightOn=new LightOnCommand(kitchenLight);
		LightOffCommand kitchenRoomLightOff=new LightOffCommand(kitchenLight);
		
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
		
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(1);

	}

}
