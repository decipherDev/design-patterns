package dev.designpattern.proxy;

import java.time.LocalDateTime;

public class WeatherApiImpl implements WeatherApi{
	public String getWeatherDetailsForDay(LocalDateTime localDateTime) {
		return "Weather Details a Day";
	}

	public String getWeatherDetailsForWeek(int weekNumber) {
		return "Weather Details for a week";
	}
}
