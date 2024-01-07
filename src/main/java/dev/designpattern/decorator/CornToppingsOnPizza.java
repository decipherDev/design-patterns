package dev.designpattern.decorator;

public class CornToppingsOnPizza extends PizzaToppingsDecorator {
	private final BasePizza basePizza;
	public CornToppingsOnPizza(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int cost() {
		return this.basePizza.cost()+50;
	}
}
