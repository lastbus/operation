package com.shgc.aBuilderPattern.implement;

/**
 * Created by make on 10/25/15.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
