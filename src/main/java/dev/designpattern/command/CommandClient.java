package dev.designpattern.command;

public class CommandClient {
	public static void main(String[] args) {
		StockBroker sb = new StockBroker();
		Stock hdfc = new Stock("HDFCBANK", 100);
		Order buyOrder = new BuyStock(hdfc);
		Order sellOrder = new SellStock(hdfc);
		
		sb.takeOrder(buyOrder);
		sb.takeOrder(sellOrder);
		
		sb.processOrder();
	}
}
