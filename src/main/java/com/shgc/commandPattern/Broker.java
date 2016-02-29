package com.shgc.commandPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by make on 2/26/16.
 */
public class Broker {

    public List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) order.execute();

        orderList.clear();
    }

}
