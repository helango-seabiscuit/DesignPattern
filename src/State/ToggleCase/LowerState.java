package State.ToggleCase;

public class LowerState implements State{

	@Override
	public void writeName(StateContext context, String name) {
		System.out.print(" "+name.toLowerCase());
		context.setCurrentState(new UpperState());
		
	}

}
