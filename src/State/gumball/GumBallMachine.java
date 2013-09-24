package State.gumball;

public class GumBallMachine {
	State hasQuarterState;
	State noQuarterState;
	State soldOutState;
	State soldState;
	State winnerState;
	
	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	State currentState=noQuarterState;
	int count=0;
	
	public GumBallMachine(int numberGumBalls){
		hasQuarterState=new HasQuarterState(this);
		noQuarterState=new NoQuarterState(this);
		soldOutState=new SoldOutState(this);
		soldState=new SoldState(this);
		winnerState=new WinnerState(this);
		this.count=numberGumBalls;
		if(this.count>0){
			currentState=noQuarterState;
		}
	}
	
	public void insertQuarter(){
		currentState.insertQuarter();
	}
	
	public void ejectQuarter(){
		currentState.ejectQuarter();
	}
	
	public void turnCrank(){
		currentState.turnCrank();
		currentState.dispense();
	}
	
	public void setState(State state){
		this.currentState=state;
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot");
		if(count!=0){
			count=count-1;
		}
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

}
