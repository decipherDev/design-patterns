package dev.designpattern.strategy;

public class OrderPayment {
	private PaymentStrategy strategy;
	
	public OrderPayment(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void processPayment() {
		strategy.processPayment();
	}
	
	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
}
