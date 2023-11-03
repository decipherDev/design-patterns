package dev.designpattern.command;

public class SellStock implements Order {
	private final Stock stock;
	
	public SellStock(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public boolean execute() {
		stock.sellStock();
		return true;
	}
}
