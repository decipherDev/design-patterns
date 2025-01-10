package dev.designpattern.mediator;

import static java.util.random.RandomGenerator.getDefault;

public class RailwayControlOffice implements TrainDispatcher {
	@Override
	public void requestPassing(Train t) {
		t.notifyTrainDispatcher("Passing approved");		
	}

	@Override
	public void requestPlatform(Train t) {
		t.notifyTrainDispatcher("Platform "+ getDefault().nextInt(10) + " allocated");
	}
	
	

}
