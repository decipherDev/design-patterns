package dev.designpattern.state;

public class TransactionState implements ATMState {
	@Override
	public void handleRequest() {
		System.out.println("Selected Transaction is getting processed");
	}
}
