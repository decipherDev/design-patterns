package dev.designpattern.bridge;

public class SmallSizedButton implements ButtonSize {

	@Override
	public int getSize() {
		return 10;
	}
	
}
