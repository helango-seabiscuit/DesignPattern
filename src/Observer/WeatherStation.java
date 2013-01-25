package Observer;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		
		CurrentConditionDisplay currnetDisplay=new CurrentConditionDisplay(weatherData);
		StatisticDisplay statisticDisplay=new StatisticDisplay(weatherData);
		ForecastDisplayElement forecastDisplay=new ForecastDisplayElement(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);

	}

}
