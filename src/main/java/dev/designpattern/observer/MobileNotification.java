package dev.designpattern.observer;

public class MobileNotification implements Observer {
	@Override
	public void update(PaymentState s) {
		System.out.println("Emailing about payment state "+ s.getPaymentState());
	}
}
