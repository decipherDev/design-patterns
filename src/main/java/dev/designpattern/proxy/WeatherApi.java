package dev.designpattern.proxy;

import java.time.LocalDateTime;

public interface WeatherApi {
	/** Returns the temperature for the day **/
	String getWeatherDetailsForDay(LocalDateTime localDateTime, String isoCode);
	
	/** Returns the temperature for the week, by providing the week no < 52 **/
	String getWeatherDetailsForWeek(int weekNumber, String isoCode);
}
