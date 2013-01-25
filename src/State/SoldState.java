package State;

public class SoldState implements State {
	GumBallMachine machine;
	
	public SoldState(GumBallMachine machine){
		this.machine=machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait we are already giving you a gumball");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry you already turned the crank");

	}

	@Override
	public void dispense() {
		machine.releaseBall();
		if(machine.count>0){
			machine.setState(machine.getNoQuarterState());
		}
		else{
			System.out.println("Oops..out of gumballs");
			machine.setState(machine.getSoldOutState());
		}

	}

	@Override
	public void turnCrank() {
		System.out.println("Turning twice doesnt get another gumball");

	}

}
