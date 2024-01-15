package dev.designpattern.factory;

public class DebitPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Processing payment using Debit mode");
    }
}
