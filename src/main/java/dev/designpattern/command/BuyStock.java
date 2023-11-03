package dev.designpattern.command;

public class BuyStock implements Order {
	private final Stock stock;
	
	public BuyStock(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public boolean execute() {
		stock.buyStock();
		return true;
	}
}
