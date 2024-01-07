package dev.designpattern.decorator;

public class PizzaClient {
	public static void main(String[] args) {
		FarmHousePizza farmHousePizza = new FarmHousePizza();
		VegDelight vegDelightPizza = new VegDelight();
		BasePizza pizzaWithToppings = new CornToppingsOnPizza(new CheeseBustPizza(vegDelightPizza));
		System.out.println("Cost of Farm House Pizza: "+ farmHousePizza.cost());
		System.out.println("Cost of Veg Delight Pizza: "+ pizzaWithToppings.cost());
	}
}
