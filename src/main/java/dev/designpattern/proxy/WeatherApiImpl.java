package dev.designpattern.proxy;

import java.time.LocalDateTime;

public class WeatherApiImpl implements WeatherApi{
	public String getWeatherDetailsForDay(LocalDateTime localDateTime, String isoCode) {
		return "Weather details for a Day";
	}

	public String getWeatherDetailsForWeek(int weekNumber, String isoCode) {
		return "Weather details for a week";
	}
}
