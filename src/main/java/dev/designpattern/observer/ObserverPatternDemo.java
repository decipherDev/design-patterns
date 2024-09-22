package dev.designpattern.observer;

import dev.designpattern.observer.PaymentState.PaymentStateValue;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		PaymentState ps = new PaymentState();
		ps.subscribe(new EmailNotification());
		ps.subscribe(new MobileNotification());
		
		ps.changeState(PaymentStateValue.INITIATED);
		ps.changeState(PaymentStateValue.IN_PROGRESS);
		ps.changeState(PaymentStateValue.DONE);
	}
}
