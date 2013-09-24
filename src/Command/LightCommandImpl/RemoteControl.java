package Command.LightCommandImpl;


//INVOKER Object
public class RemoteControl {
	Command onSlots[];
	Command offSlots[];
	Command undoCommand;
	
	public RemoteControl(){
		Command noCommand=new NoCommand();
		onSlots=new Command[7];
		offSlots=new Command[7];
		for(int i=0;i<7;i++){
			onSlots[i]=noCommand;
			offSlots[i]=noCommand;
		}
		
	}
	
	public void setCommand(int slot,Command onCommand,Command offCommand){
		onSlots[slot]=onCommand;
		offSlots[slot]=offCommand;
	}
	
	public void onButtonWasPushed(int slot){
		onSlots[slot].execute();
	}
	
	public void offButtonWasPushed(int slot){
		offSlots[slot].execute();
	}
	
	

}
