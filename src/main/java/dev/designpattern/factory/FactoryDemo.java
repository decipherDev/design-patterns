package dev.designpattern.factory;

public class FactoryDemo {
   public static void main(String[] args) {
        PaymentProcessorFactory factory = new PaymentProcessorFactory();
        factory.getPaymentProcessor(PaymentProcessorType.DEBIT).processPayment(); 
        factory.getPaymentProcessor(PaymentProcessorType.CREDIT).processPayment(); 
    }  
}
