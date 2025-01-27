package dev.designpattern.strategy;

public class PaypalPayment implements PaymentStrategy {
	@Override
	public void processPayment() {
		System.out.println("Processing through paypal");
	}
}
