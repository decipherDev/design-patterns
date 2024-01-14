package dev.designpattern.facade;

import java.util.Random;

public class BrokerApi {
    public boolean executeOrder(Order order) {
        System.out.println("Order Execued "+ order.getId());
        return true;
    }

    public Double getLastestPrice(String stockIdentifier) {
        return new Random().nextDouble();
    }
}
