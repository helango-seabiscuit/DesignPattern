package Template;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		// TODO Auto-generated method stub
		System.out.println("Steeping the tea");
	}


	@Override
	public void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding lemon");
	}
	
	@Override
	public boolean isUserNeedCondiments(){ // overriden hook method
		
		//implement user interaction to ask for adding condiments.
		return true;
	}
}
