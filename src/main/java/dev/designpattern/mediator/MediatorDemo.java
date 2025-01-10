package dev.designpattern.mediator;

public class MediatorDemo {
	public static void main(String[] args) {
		TrainDispatcher dispatcher = new RailwayControlOffice();
		PassengerTrain shatabdi = new PassengerTrain(dispatcher, 1234);
		PassengerTrain rajdhani = new PassengerTrain(dispatcher, 5678);
		shatabdi.requestPlatform();
		shatabdi.requestPassing();
		rajdhani.requestPlatform();
		rajdhani.requestPassing();
	}
}
