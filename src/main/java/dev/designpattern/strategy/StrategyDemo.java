package dev.designpattern.strategy;

public class StrategyDemo {
	public static void main(String[] args) {
		OrderPayment payment = new OrderPayment(new CreditCardPayment());
		payment.processPayment();
		payment.setStrategy(new PaypalPayment());
		payment.processPayment();
		payment.setStrategy(new DebitCardPayment());
		payment.processPayment();
	}
}
