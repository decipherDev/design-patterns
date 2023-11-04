package dev.designpattern.decorator;

public class PizzaDecorator extends BasePizza {
	private BasePizza basePizza;
	public PizzaDecorator(BasePizza basePizza) {
		this.basePizza = basePizza;
	}
	
	@Override
	public int cost() {
		return super.cost();
	}
}
