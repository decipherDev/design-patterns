package dev.designpattern.facade;

import java.math.BigDecimal;

public class StockTradingFacadeImpl implements StockTradingFacade {
    private final OrderManager orderManager;
    private final PortfolioManager portfolioManager;
    private final BrokerApi brokerApi;

    public StockTradingFacadeImpl() {
        this.orderManager = new OrderManager();
        this.portfolioManager = new PortfolioManager();
        this.brokerApi = new BrokerApi();
    }

    @Override
    public void buyStock(Stock stock) {
        if (stock.getBuyPrice().multiply( BigDecimal.valueOf(stock.getQuantity())).compareTo(portfolioManager.getAccontBalance()) == -1) {
            orderManager.buyOrder(stock);
            brokerApi.executeOrder(orderManager.getAllOrders().pop());
            portfolioManager.updatePortfolio(stock, Order.Type.BUY);
            System.out.println(stock.getName()+ " bought");   
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void sellStock(Stock stock) {
        Stock existingStock = null;
        if ((existingStock = portfolioManager.hasStock(stock)) != null) {
            orderManager.sellOrder(stock);
            brokerApi.executeOrder(orderManager.getAllOrders().pop());
            stock.setQuantity(existingStock.getQuantity() - stock.getQuantity());
            portfolioManager.updatePortfolio(stock, Order.Type.SELL);
            System.out.println(stock.getName()+ " sold");   
        } else {
            System.out.println("Stocks are not present in holding");       
        }       
    }    
}
