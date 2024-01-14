package dev.designpattern.facade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PortfolioManager {
    private List<Stock> stocks;
    private BigDecimal availableMargin = BigDecimal.valueOf(1000);

    public PortfolioManager() {
        stocks = new ArrayList<>();
    }

    public Stock hasStock(Stock stock) {
        int index = stocks.indexOf(stock);
        return index != -1 ? stocks.get(index) : null;
    }

    public void updatePortfolio(Stock stock, Order.Type type) {
        if (Order.Type.BUY.equals(type)) {
            stocks.add(stock);
        } else {
            int index = stocks.indexOf(stock);
            stocks.add(index, stock);
        }
    }

    public BigDecimal getAccontBalance() {
        return availableMargin;
    }
}
