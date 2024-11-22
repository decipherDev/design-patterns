package dev.designpattern.template;

public abstract class PaymentMode {
	public void processPayment() {
		preparePaymentRequest();
		initiatePayment();
		processPaymentResponse();
	}

	protected abstract void preparePaymentRequest();

	protected abstract void initiatePayment();

	protected abstract void processPaymentResponse();

}
