package dev.designpattern.mediator;

public interface Train {
	void requestPassing();
	void requestPlatform();
	void notifyTrainDispatcher(String message);
}
