package dev.designpattern.observer;

import java.util.HashSet;
import java.util.Set;

public class PaymentState {
	private PaymentStateValue paymentState;
	private Set<Observer> observers = new HashSet<>(); 
	enum PaymentStateValue {
		INITIATED,
		IN_PROGRESS,
		FAILED,
		DONE;
	}
		
	public PaymentStateValue getPaymentState() {
		return paymentState;
	}
	
	public void subscribe(Observer o) {
		observers.add(o);
	}
	
	public void unsubscribe(Observer o) {
		observers.remove(o);
	}

	public void changeState(PaymentStateValue state) {
		this.paymentState = state;
		notifyObservers();
	}
	
	public void notifyObservers() {
		observers.forEach(o -> o.update(this));
	}
}
