package State.gumball;

public class SoldOutState implements State {
	GumBallMachine machine;
	
	public SoldOutState(GumBallMachine machine){
		this.machine=machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("GumBalls sold old ..dont insert quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("No quarters inserted");

	}

	@Override
	public void dispense() {
		System.out.println("No more gumballs available...All sold out");

	}

	@Override
	public void turnCrank() {
		System.out.println("");

	}

}
