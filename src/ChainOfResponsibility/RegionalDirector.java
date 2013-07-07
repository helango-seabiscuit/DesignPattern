package ChainOfResponsibility;

public class RegionalDirector extends PRHandler {
	static double LIMIT = 100000;
	
	public RegionalDirector(String name){
		super(name);
	}


	@Override
	public boolean authorize(PurchaseRequest request) {
		double amount = request.getAmount();
		
		if(amount <= LIMIT){
			System.out.println("Regional Director has authorized the PR :"+amount);
			return true;
		}
		else{
			return getNextHandler().authorize(request);
		}
		
	}

}