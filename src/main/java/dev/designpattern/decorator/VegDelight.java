package dev.designpattern.decorator;

public class VegDelight extends PizzaToppingsDecorator {
	public VegDelight() {
	}

	@Override
	public int cost() {
		return 400;
	}

}
