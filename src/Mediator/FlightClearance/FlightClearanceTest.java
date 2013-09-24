package Mediator.FlightClearance;

public class FlightClearanceTest {

	public static void main(String[] args) {
		ClearanceMediator atcMediator = new FlightRunwayMediator();
	    Flight sparrow101 = new Flight(atcMediator);
	    Runway mainRunway = new Runway(atcMediator);
	    atcMediator.registerFlight(sparrow101);
	    atcMediator.registerRunway(mainRunway);
	    sparrow101.getReady();
	    mainRunway.land();
	    sparrow101.land();

	}

}
