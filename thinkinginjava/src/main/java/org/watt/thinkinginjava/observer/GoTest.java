package org.watt.thinkinginjava.observer;

public class GoTest {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
		
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(11, 22, 33);
		weatherData.setMeasurements(11, 22, 33);
		weatherData.setMeasurements(11, 22, 33);
		weatherData.setMeasurements(11, 22, 33);

	}

}
