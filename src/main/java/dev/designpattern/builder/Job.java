package dev.designpattern.builder;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Job {
	private int id;
	private String name;
	private LocalDateTime startDateAndTime;
	private Map<Object, Object> jobParams = new HashMap<>();
	
	private Job(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.startDateAndTime = builder.startDateAndTime;
		this.jobParams = builder.map;
	}
	
	public static class Builder {
		private int id;
		private String name;
		private LocalDateTime startDateAndTime;
		private Map<Object, Object> map = new HashMap<>();
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder startDateAndTime(LocalDateTime startDateAndTime) {
			this.startDateAndTime = startDateAndTime;
			return this;
		}

		public Builder map(Map<Object, Object> map) {
			this.map = map;
			return this;
		}
		
		public Job build() {
			return new Job(this);
		}
	}
	
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public LocalDateTime getStartDateAndTime() {
		return startDateAndTime;
	}


	public Map<Object, Object> getMap() {
		return jobParams;
	}
}
