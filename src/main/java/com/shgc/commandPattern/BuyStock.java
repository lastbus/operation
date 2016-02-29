package com.shgc.commandPattern;

/**
 * Created by make on 2/26/16.
 */
public class BuyStock implements Order {
    private Stock stock = null;

    public BuyStock(Stock stock){
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
