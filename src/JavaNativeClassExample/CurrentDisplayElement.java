package JavaNativeClassExample;

import java.util.Observable;
import java.util.Observer;

import Observer.DisplayElement;



public class CurrentDisplayElement implements Observer ,DisplayElement {

	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentDisplayElement(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		System.out.println("Current condition :"+ temperature+
				"F degrees and "+humidity+" %humidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData)o;
			this.temperature=weatherData.getTemperature();
			this.humidity=weatherData.getHumidity();
			display();
		}
		
	}

}
