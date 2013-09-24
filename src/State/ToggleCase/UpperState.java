package State.ToggleCase;

public class UpperState implements State {

	@Override
	public void writeName(StateContext context, String name) {
		System.out.print(" "+name.toUpperCase());
		context.setCurrentState(new LowerState());
		
	}
	
	

}
