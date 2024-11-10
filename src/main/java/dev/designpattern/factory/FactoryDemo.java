package dev.designpattern.factory;

import static dev.designpattern.factory.PaymentProcessorType.CREDIT;
import static dev.designpattern.factory.PaymentProcessorType.DEBIT;
import static dev.designpattern.factory.PaymentProcessorType.WALLET;

public class FactoryDemo {
   public static void main(String[] args) {
        PaymentProcessorFactory factory = new PaymentProcessorFactory();
        factory.getPaymentProcessor(DEBIT).processPayment(); 
        factory.getPaymentProcessor(CREDIT).processPayment();
        factory.getPaymentProcessor(WALLET).processPayment(); 
    }  
}
