package org.watt.thinkinginjava.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	

	public void display() {
		System.out.println("CurrentConditionDisplay: "+ temperature +" ," + humidity + ", " +pressure);
		
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;	
		display();
	}

}
