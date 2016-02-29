package com.shgc.aBuilderPattern.implement;

/**
 * Created by make on 10/25/15.
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
