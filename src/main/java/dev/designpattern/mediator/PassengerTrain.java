package dev.designpattern.mediator;

public class PassengerTrain implements Train {
	
	private final TrainDispatcher dispatcher;
	private final Integer trainNum;
	
	public PassengerTrain(TrainDispatcher dispatcher, Integer trainCode) {
		this.dispatcher = dispatcher;
		this.trainNum = trainCode;
	}

	@Override
	public void requestPassing() {
		dispatcher.requestPassing(this);	
	}

	@Override
	public void requestPlatform() {
		dispatcher.requestPlatform(this);
	}
	
	@Override
	public void notifyTrainDispatcher(String message) {
		System.out.println("Passenger Train with no "+ trainNum + " "+ message);
	}
}
