package com.shgc.aBuilderPattern.implement;

/**
 * Created by make on 10/25/15.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
