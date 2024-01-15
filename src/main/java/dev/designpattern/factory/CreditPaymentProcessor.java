package dev.designpattern.factory;

public class CreditPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Payment processing using Credit mode");
    }
}
