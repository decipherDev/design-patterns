package dev.designpattern.facade;

import java.util.ArrayDeque;
import java.util.Deque;

public class OrderManager {
    Deque<Order> orders = new ArrayDeque<>();
    
    public void buyOrder(Stock stock) {
        orders.add(new Order(Order.Type.BUY, stock));
    }

    public void sellOrder(Stock stock) {
       orders.add(new Order(Order.Type.BUY, stock));
    }

    public Deque<Order> getAllOrders() {
        return orders;
    }
}
