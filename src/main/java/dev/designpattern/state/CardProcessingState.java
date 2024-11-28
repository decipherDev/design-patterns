package dev.designpattern.state;

public class CardProcessingState implements ATMState {
	@Override
	public void handleRequest() {
		System.out.println("Card is entered and is getting processed");
	}
}
