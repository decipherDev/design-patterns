package dev.designpattern.decorator;

public class PizzaClient {
	public static void main(String[] args) {
		FarmHousePizza farmHousePizza = new FarmHousePizza(new BasePizza());
		VegDelight vegDelightPizza = new VegDelight(new BasePizza());
		
		System.out.println("Cost of Farm House Pizza: "+farmHousePizza.cost());
		System.out.println("Cost of Veg Delight Pizza: "+vegDelightPizza.cost());
	}
}
