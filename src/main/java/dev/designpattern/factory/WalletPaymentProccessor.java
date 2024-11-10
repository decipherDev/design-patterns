package dev.designpattern.factory;

public class WalletPaymentProccessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Payment processing using Wallet");
    }
}
