package dev.designpattern.adapter;

import java.time.LocalDateTime;

public interface CustomerProfile {
	String getFirstName();
	String getLastName();
	LocalDateTime profileCreationDate();
}
