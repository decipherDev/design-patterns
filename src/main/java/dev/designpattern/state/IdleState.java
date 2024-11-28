package dev.designpattern.state;

public class IdleState implements ATMState {

	@Override
	public void handleRequest() {
		System.out.println("ATM is in idle state");
	}

}
