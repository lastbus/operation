package com.shgc.aBuilderPattern.implement;

import com.shgc.aBuilderPattern.interfaces.Item;
import com.shgc.aBuilderPattern.interfaces.Packing;

/**
 * Created by make on 10/25/15.
 */
public abstract  class ColdDrink implements Item {
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}
