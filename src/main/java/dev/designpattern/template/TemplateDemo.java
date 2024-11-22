package dev.designpattern.template;

public class TemplateDemo {
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor(new CreditPaymentMode());
		processor.processPayment();
		processor.changeMode(new DebitPaymentMode());
		processor.processPayment();
		processor.changeMode(new WalletPaymentMode());
		processor.processPayment();
	}
}
