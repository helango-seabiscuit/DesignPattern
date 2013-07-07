package ChainOfResponsibility;

public class BranchManager extends PRHandler {
	static double LIMIT = 25000;
	
	public BranchManager(String name){
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
