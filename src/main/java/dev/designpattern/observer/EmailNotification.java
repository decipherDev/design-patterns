package dev.designpattern.observer;

public class EmailNotification implements Observer {
	@Override
	public void update(PaymentState s) {
		System.out.println("Sending SMS about payment state "+ s.getPaymentState());
	}
}
