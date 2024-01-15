package dev.designpattern.factory;

public class PaymentProcessorFactory {
    public PaymentProcessor getPaymentProcessor(PaymentProcessorType type) {
        if (PaymentProcessorType.DEBIT.equals(type)) {
            return new DebitPaymentProcessor();
        } else if (PaymentProcessorType.CREDIT.equals(type)) {
            return new CreditPaymentProcessor();
        } 
        return new WalletPaymentProccessor();
    }
}
