package com.shgc.commandPattern;

/**
 * Created by make on 2/26/16.
 */
public class SellStock implements Order {

    private Stock stock = null;

    public SellStock(Stock stock){
        this.stock = stock;
    }


    @Override
    public void execute() {
        stock.sell();
    }
}
