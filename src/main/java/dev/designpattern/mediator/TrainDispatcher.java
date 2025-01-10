package dev.designpattern.mediator;

public interface TrainDispatcher {
	void requestPassing(Train t);
	void requestPlatform(Train t);
}
