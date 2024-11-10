package dev.designpattern.factory;

public class PaymentProcessorFactory {
	public PaymentProcessor getPaymentProcessor(PaymentProcessorType type) {
		return type.get();
	}
}
