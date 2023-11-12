package dev.designpattern.adapter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class AdapterClient {
	public static void main(String[] args) {
		List<CustomerProfile> customers = new ArrayList<>();
		CustomerProfile cp = new CustomerProfileImpl("John", "Doe", LocalDateTime.now());
		LegacyCustomerProfile lcp = new LegacyCustomerProfile("Jane Doe", new GregorianCalendar().getTime());
		customers.add(cp);
		customers.add(new CustomerProfileFacade(lcp));
		System.out.println(customers);
	}
}
