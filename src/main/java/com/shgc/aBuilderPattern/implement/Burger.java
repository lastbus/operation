package com.shgc.aBuilderPattern.implement;

import com.shgc.aBuilderPattern.interfaces.Item;
import com.shgc.aBuilderPattern.interfaces.Packing;

/**
 * Created by make on 10/25/15.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
