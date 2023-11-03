package dev.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {
	List<Order> orders = new ArrayList<>();
	
	public void takeOrder(Order order) {
		this.orders.add(order);
	}
	
	public void processOrder() {
		this.orders.forEach(Order::execute);
	}
}
