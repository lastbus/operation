package com.shgc.aBuilderPattern.implement;

/**
 * Created by make on 10/25/15.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
