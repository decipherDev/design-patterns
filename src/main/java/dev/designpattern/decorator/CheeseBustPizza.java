package dev.designpattern.decorator;

public class CheeseBustPizza extends PizzaToppingsDecorator {
	private final BasePizza basePizza;
	public CheeseBustPizza(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	public int cost() {
		return this.basePizza.cost()+50;
	}
}
