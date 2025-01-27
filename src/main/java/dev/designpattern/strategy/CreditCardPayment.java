package dev.designpattern.strategy;

public class CreditCardPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Processing through credit card");
	}
}
