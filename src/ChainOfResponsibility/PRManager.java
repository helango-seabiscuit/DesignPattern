package ChainOfResponsibility;

public class PRManager {
	
	private BranchManager branchManager;
	private RegionalDirector regionalDirector;
	private VicePresident vicePresident;
	private PresidentCOO coo;
	
	public static void main(String args[]){
		PRManager manager = new PRManager();
		manager.createAuthorizationFlow();
		PurchaseRequest request = new PurchaseRequest(1, "Office Supplies", 10000);
		manager.branchManager.authorize(request);

	}
	
	public void createAuthorizationFlow(){
		branchManager = new BranchManager("Robin");
		regionalDirector = new RegionalDirector("Oscar");
		vicePresident = new VicePresident("Kate");
		coo = new PresidentCOO("Drew");
		branchManager.setNextHandler(regionalDirector);
		regionalDirector.setNextHandler(vicePresident);
		vicePresident.setNextHandler(coo);
	}

}
