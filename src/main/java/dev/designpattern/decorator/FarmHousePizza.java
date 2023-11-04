package dev.designpattern.decorator;

public class FarmHousePizza extends PizzaDecorator {

	public FarmHousePizza(BasePizza basePizza) {
		super(basePizza);
	}

	@Override
	public int cost() {
		return super.cost() + 300;
	}

}
