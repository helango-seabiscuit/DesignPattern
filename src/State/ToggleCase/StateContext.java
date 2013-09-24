package State.ToggleCase;

public class StateContext {
	State currentState;
	
	StateContext(){
		setCurrentState(new LowerState());
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}
	
	public void outputName(String name){
		getCurrentState().writeName(this,name);
	}
	

}
