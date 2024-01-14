package dev.designpattern.facade;

import java.math.BigDecimal;

public class FacadeDemo {
  public static void main(String[] args) {
        StockTradingFacade facade = new StockTradingFacadeImpl();
        facade.buyStock(new Stock("Google", 2, BigDecimal.valueOf(400)));
        facade.sellStock(new Stock("Google", 1, BigDecimal.valueOf(500)));      
  }  
}
