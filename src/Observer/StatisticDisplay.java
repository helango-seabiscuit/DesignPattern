package Observer;

public class StatisticDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    
    public StatisticDisplay(Subject weather){
    	this.weatherData=weather;
    	weatherData.registerObserver(this);
    }
	
	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature :"+(temperature/3)+"/"+
				(temperature-(temperature/3))+"/"+temperature);
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
		
	}
	

}
