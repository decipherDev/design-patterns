package dev.designpattern.facade;

import java.util.Random;

public class Order {
    private Integer id;
    private Type type;
    private Stock stock;

    public Order(Type type, Stock stock) {
        this.id = new Random().nextInt(100);
        this.type = type;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public Stock getStock() {
        return stock;
    }

    public static enum Type {
        SELL,
        BUY;
    }
}
