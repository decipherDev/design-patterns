package dev.designpattern.template;

public class CreditPaymentMode extends PaymentMode {
	
	@Override
	protected void preparePaymentRequest() {
		System.out.println("Preparing Credit payment request");
	}

	@Override
	protected void initiatePayment() {
		System.out.println("Initiating Credit payment");
	}

	@Override
	protected void processPaymentResponse() {
		System.out.println("Process Credit payment response");
	}    	
}
