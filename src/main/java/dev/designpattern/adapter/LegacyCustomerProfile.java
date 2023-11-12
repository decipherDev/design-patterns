package dev.designpattern.adapter;

import java.util.Date;

public class LegacyCustomerProfile {
	private String name;
	private Date profileCreationDate;
	
	public LegacyCustomerProfile(String name, Date profileCreationDate) {
		this.name = name;
		this.profileCreationDate = profileCreationDate;
	}


	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Date getProfileCreationDate() {
		return profileCreationDate;
	}
	
	public void setProfileCreationDate(Date profileCreationDate) {
		this.profileCreationDate = profileCreationDate;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", profileCreationDate=" + profileCreationDate + "]";
	}
	
	
}
