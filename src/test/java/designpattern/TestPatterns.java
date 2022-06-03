package designpattern;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import dev.designpattern.builder.Job;
import dev.designpattern.chainofresponsibility.ChainOfResponsibilityATMClient;
import dev.designpattern.proxy.WeatherClient;

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
		WeatherClient client = new WeatherClient();
		Assert.assertNotNull(client.getWeatherDetailsForToday());
		Assert.assertNotNull(client.getWeatherDetailsForWeek());
	}
	
	@Test
	public void testChainOfResponsibilityPattern() {
		ChainOfResponsibilityATMClient client = new ChainOfResponsibilityATMClient();
		client.build().dispenseCash(20000);
		client.build().dispenseCash(4500);
	}
}
