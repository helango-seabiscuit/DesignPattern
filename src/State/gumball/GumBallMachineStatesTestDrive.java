package State.gumball;

public class GumBallMachineStatesTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GumBallMachine machine=new GumBallMachine(5);
		machine.insertQuarter();
		machine.turnCrank();
		
		machine.insertQuarter();
		machine.turnCrank();
		machine.insertQuarter();
		machine.turnCrank();

	}

}
