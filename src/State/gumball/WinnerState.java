package State.gumball;

public class WinnerState implements State{
	GumBallMachine machine;
	
	public WinnerState(GumBallMachine machine){
		this.machine=machine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispense() {
		System.out.println("You are a winner! You get two gumballs for quarter");
		machine.releaseBall();
		if(machine.count==0){
			machine.setState(machine.getSoldOutState());
		}
		else{
			machine.releaseBall();
			if(machine.count>0){
				machine.setState(machine.getNoQuarterState());
			}
			else{
				System.out.println("Oops,out of gumballs");
				machine.setState(machine.getSoldOutState());
			}
		}
		
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		
	}
	

}
