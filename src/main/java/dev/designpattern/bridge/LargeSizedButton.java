package dev.designpattern.bridge;

public class LargeSizedButton implements ButtonSize {

	@Override
	public int getSize() {
		return 100;
	}
}
