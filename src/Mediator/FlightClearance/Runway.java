package Mediator.FlightClearance;

public class Runway {
	private ClearanceMediator atcMediator;
	 
	  public Runway(ClearanceMediator atcMediator) {
	    this.atcMediator = atcMediator;
	    atcMediator.setLandingStatus(true);
	  }
	 
	 
	  public void land() {
	    System.out.println("Landing permission granted...");
	    atcMediator.setLandingStatus(true);
	  }
	 
}
