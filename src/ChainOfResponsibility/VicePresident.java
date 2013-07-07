package ChainOfResponsibility;

public class VicePresident extends PRHandler {
	static double LIMIT = 200000;
	
	public VicePresident(String name){
		super(name);
	}


	@Override
	public boolean authorize(PurchaseRequest request) {
		double amount = request.getAmount();
		
		if(amount <= LIMIT){
			System.out.println("Branch Manager has authorized the PR :"+amount);
			return true;
		}
		else{
			return getNextHandler().authorize(request);
		}
		
	}

}