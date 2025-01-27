package dev.designpattern.strategy;

public class DebitCardPayment implements PaymentStrategy  {
	@Override
	public void processPayment() {
		System.out.println("Processing through debit card");
	}

}
