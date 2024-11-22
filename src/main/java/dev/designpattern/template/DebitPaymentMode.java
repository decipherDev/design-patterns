package dev.designpattern.template;

public class DebitPaymentMode extends PaymentMode {
	@Override
	protected void preparePaymentRequest() {
		System.out.println("Preparing Debit payment request");
	}

	@Override
	protected void initiatePayment() {
		System.out.println("Initiating Debit payment");
	}

	@Override
	protected void processPaymentResponse() {
		System.out.println("Process Debit payment response");
	}
}
