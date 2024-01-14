package dev.designpattern.facade;

import java.math.BigDecimal;

public class Stock {
    private String name;
    private int quantity;
    private BigDecimal buyPrice;

    public Stock(String name, int quantity, BigDecimal buyPrice) {
        this.name = name;
        this.quantity = quantity;
        this.buyPrice = buyPrice;
    }

    public BigDecimal getBuyPrice() {
        return this.buyPrice;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getName() {
        return name;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Stock other = (Stock) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}