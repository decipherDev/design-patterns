package dev.designpattern.template;

public class PaymentProcessor {
	private PaymentMode paymentMode;
	public PaymentProcessor(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	public void processPayment() {
		paymentMode.processPayment();
	}
	
	public void changeMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
}
