package dev.designpattern.proxy;

import java.time.LocalDateTime;

public class WeatherClient {
	private WeatherApiProxy weatherApiProxy;
	
	public WeatherClient() {
		this.weatherApiProxy = new WeatherApiProxy(new WeatherApiImpl());
	}
	
	public String getWeatherDetailsForToday() {
		return weatherApiProxy.getWeatherDetailsForDay(LocalDateTime.now());
	}
	
	public String getWeatherDetailsForWeek() {
		int noOfWeek = weatherApiProxy.getWeekNumberFromLocalDateTime(LocalDateTime.now());
		return weatherApiProxy.getWeatherDetailsForWeek(noOfWeek);		
	}
}
