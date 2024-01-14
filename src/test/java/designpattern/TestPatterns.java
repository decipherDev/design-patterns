package designpattern;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import dev.designpattern.builder.Job;
import dev.designpattern.chainofresponsibility.ChainOfResponsibilityATMClient;
import dev.designpattern.proxy.WeatherApi;
import dev.designpattern.proxy.WeatherApiProxy;

public class TestPatterns {
	@Test
	public void testBuilderPatter() {
		Job job = new Job.Builder()
				         .id(1)
				         .name("")
				         .startDateAndTime(LocalDateTime.now())
				         .build();
		
		Assert.assertEquals(1, job.getId());
	}
	
	@Test
	public void testProxyPattern() {
		WeatherApi weatherApi = new WeatherApiProxy();
		Assert.assertNotNull(weatherApi.getWeatherDetailsForDay(LocalDateTime.now(), "IN"));
		weatherApi.getWeatherDetailsForWeek(LocalDateTime.now().getDayOfYear()/52, "AB");
	}
	
	@Test
	public void testChainOfResponsibilityPattern() {
		ChainOfResponsibilityATMClient.build().dispenseCash(20000);
		ChainOfResponsibilityATMClient.build().dispenseCash(4500);
	}
}
