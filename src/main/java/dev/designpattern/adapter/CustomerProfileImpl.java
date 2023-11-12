package dev.designpattern.adapter;

import java.time.LocalDateTime;

public class CustomerProfileImpl implements CustomerProfile {
	private String firstName;
	private String lastName;
	private LocalDateTime date;
	
	
	public CustomerProfileImpl(String firstName, String lastName, LocalDateTime date) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.date = date;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	@Override
	public LocalDateTime profileCreationDate() {
		return date;
	}

	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + ", date=" + date + "]";
	}
	
	
}
