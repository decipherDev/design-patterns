package dev.designpattern.adapter;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class CustomerProfileFacade implements CustomerProfile {
	private final LegacyCustomerProfile legacyCustomerProfile;
	
	public CustomerProfileFacade(LegacyCustomerProfile legacyCustomerProfile) {
		this.legacyCustomerProfile = legacyCustomerProfile;
	}
	
	@Override
	public String getFirstName() {
		return legacyCustomerProfile.getName().split("")[0];
	}

	@Override
	public String getLastName() {
		return legacyCustomerProfile.getName().split("")[0];
	}

	@Override
	public LocalDateTime profileCreationDate() {
		return legacyCustomerProfile.getProfileCreationDate()
				                    .toInstant()
				                    .atZone(ZoneId.systemDefault())
				                    .toLocalDateTime();
	}

	@Override
	public String toString() {
		return "CustomerProfileFacade [legacyCustomerProfile=" + legacyCustomerProfile + "]";
	}
}
