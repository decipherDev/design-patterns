package designpattern;

import java.time.LocalDateTime;

import org.junit.Assert;
import org.junit.Test;

import dev.designpattern.builder.Job;

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
}
