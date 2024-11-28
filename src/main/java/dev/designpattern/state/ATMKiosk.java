package dev.designpattern.state;

public class ATMKiosk {
	private ATMState atmState;
	public ATMKiosk(ATMState atmState) {
		this.atmState = atmState;
	}
	
	public void handle() {
		atmState.handleRequest();
	}
	
	public void stateTransition(ATMState atmState) {
		this.atmState = atmState;
	}
}
