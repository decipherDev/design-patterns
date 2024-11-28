package dev.designpattern.state;

public class ErrorState implements ATMState {
	@Override
	public void handleRequest() {
		System.out.println("ATM ran into some errors");	
	}
}
