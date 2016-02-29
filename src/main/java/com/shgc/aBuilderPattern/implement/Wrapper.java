package com.shgc.aBuilderPattern.implement;

import com.shgc.aBuilderPattern.interfaces.Packing;

/**
 * Created by make on 10/25/15.
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}
