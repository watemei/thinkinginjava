package org.watt.thinkinginjava.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList<Observer> observeres;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observeres = new ArrayList<Observer>();
	}

	public void registerObserver(Observer observer) {
		observeres.add(observer);
	}

	public void removeObserver(Observer observer) {
		observeres.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observeres) {
			observer.update(temperature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
