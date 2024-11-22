package dev.designpattern.template;

public class WalletPaymentMode extends PaymentMode {
	@Override
	protected void preparePaymentRequest() {
		System.out.println("Preparing Wallet payment request");
	}

	@Override
	protected void initiatePayment() {
		System.out.println("Initiating Wallet payment");
	}

	@Override
	protected void processPaymentResponse() {
		System.out.println("Process Wallet payment response");
	}
}
