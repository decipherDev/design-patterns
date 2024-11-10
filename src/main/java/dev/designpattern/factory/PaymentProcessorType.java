package dev.designpattern.factory;

import java.util.function.Supplier;

public enum PaymentProcessorType {
    DEBIT (DebitPaymentProcessor::new),
    CREDIT (CreditPaymentProcessor::new),
    WALLET (WalletPaymentProccessor::new);
	
	private Supplier<PaymentProcessor> supplier;
	
	private PaymentProcessorType(Supplier<PaymentProcessor> supplier) {
		this.supplier = supplier;
	}
	
	public PaymentProcessor get() {
		return supplier.get();
	}
}
