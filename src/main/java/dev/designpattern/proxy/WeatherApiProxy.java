package dev.designpattern.proxy;

import java.time.LocalDateTime;

public class WeatherApiProxy implements WeatherApi {
	
	private WeatherApi weather;
	
	public WeatherApiProxy(WeatherApi weather) {
		this.weather = weather;
	}

	public String getWeatherDetailsForDay(LocalDateTime localDateTime) {
		return weather.getWeatherDetailsForDay(localDateTime);
	}

	public String getWeatherDetailsForWeek(int weekNumber) {
		return weather.getWeatherDetailsForWeek(weekNumber);
	}
	
	public int getWeekNumberFromLocalDateTime(LocalDateTime ldt) {
		return ldt.getDayOfYear()/52;
	}

}
