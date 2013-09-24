package JavaNativeClassExample;

import java.util.ArrayList;
import java.util.Observable;

import Observer.Weather.Observer;

public class WeatherData extends Observable{

	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		
	}
	
	
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
	
}
