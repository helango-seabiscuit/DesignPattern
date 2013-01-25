package Adapter;

public class BigTurkey implements Turkey {

	@Override
	public void wobble() {
		System.out.println("Wobbling");
		
	}

	@Override
	public void run() {
		System.out.println("Running");
		
	}

	
}
