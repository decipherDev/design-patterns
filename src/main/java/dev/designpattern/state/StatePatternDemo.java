package dev.designpattern.state;

public class StatePatternDemo {
	public static void main(String[] args) {
		var kiosk = new ATMKiosk(new IdleState());
		kiosk.handle();
		kiosk.stateTransition(new CardProcessingState());
		kiosk.handle();
		kiosk.stateTransition(new TransactionState());
		kiosk.handle();
		kiosk.stateTransition(new ErrorState());
		kiosk.handle();
	}
}
