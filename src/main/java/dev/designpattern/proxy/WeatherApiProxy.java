package dev.designpattern.proxy;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public class WeatherApiProxy implements WeatherApi {
	private static final List<String> GEO_BLOCK_LIST;
	static {
		GEO_BLOCK_LIST = List.of("AB", "BC");
	}

	private WeatherApi weather;

	public WeatherApiProxy() {
		this.weather = new WeatherApiImpl();
	}

	@Override
	public String getWeatherDetailsForDay(LocalDateTime localDateTime, String isoCode) {
		cancelledBlockedRequests(isoCode);				
		return weather.getWeatherDetailsForDay(localDateTime, isoCode);
	}
 
	@Override
	public String getWeatherDetailsForWeek(int weekNumber, String isoCode) {
		cancelledBlockedRequests(isoCode);
		return weather.getWeatherDetailsForWeek(weekNumber, isoCode);
	}

	private void cancelledBlockedRequests(String isoCode) {
        Optional<String> blocked = GEO_BLOCK_LIST.stream()
		               .filter(block -> block.equals(isoCode))
					   .findAny();
		
		if (blocked.isPresent()) {
			throw new RuntimeException("BLOCKED");
		}			
	}
}
