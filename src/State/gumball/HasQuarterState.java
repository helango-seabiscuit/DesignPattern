package State.gumball;

import java.util.Random;

public class HasQuarterState implements State {
	Random randomWinner=new Random(System.currentTimeMillis());
	GumBallMachine machine;
	
	public HasQuarterState(GumBallMachine machine){
		this.machine=machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You cant insert another quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		machine.setState(machine.getNoQuarterState());

	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");

	}

	@Override
	public void turnCrank() {
		System.out.println("YOu turned....");
		int winner=randomWinner.nextInt(10);
		if(winner==0 && machine.count>1){
			machine.setState(machine.getWinnerState());
		}
		else{
			machine.setState(machine.getSoldState());
		}
		

	}

}
