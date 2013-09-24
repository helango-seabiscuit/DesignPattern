package Mediator.FlightClearance;

public class Flight {
	private ClearanceMediator atcMediator;
	 
	  public Flight(ClearanceMediator atcMediator) {
	    this.atcMediator = atcMediator;
	  }
	 
	  public void land() {
	    if (atcMediator.isLandingOk()) {
	      System.out.println("Landing done....");
	      atcMediator.setLandingStatus(true);
	    } else
	      System.out.println("Will wait to land....");
	  }
	 
	  public void getReady() {
	    System.out.println("Getting ready...");
	  }
}
