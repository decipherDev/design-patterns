package dev.designpattern.decorator;

public class VegDelight extends PizzaDecorator {
	public VegDelight(BasePizza basePizza) {
		super(basePizza);
	}

	@Override
	public int cost() {
		return super.cost() + 400;
	}

}
