package State;

public class NoQuarterState implements State {

	GumBallMachine machine;
	
	public NoQuarterState(GumBallMachine machine){
		this.machine=machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		machine.setState(machine.getHasQuarterState());

	}

	@Override
	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");

	}

	@Override
	public void dispense() {
		System.out.println("You need to pay first");

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there's no quarter");

	}

}
