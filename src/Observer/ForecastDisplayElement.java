package Observer;

public class ForecastDisplayElement implements Observer,DisplayElement {
	 private float temperature;
	    private float humidity;
	    private float pressure;
	    private Subject weatherData;
	    
	    public ForecastDisplayElement(Subject weather){
	    	this.weatherData=weather;
	    	weatherData.registerObserver(this);
	    }
		

	@Override
	public void display() {
		System.out.println("Forecast: "+"Today is awesome");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
		
	}

}
