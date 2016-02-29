package com.shgc.strategyPattern;

/**
 * Created by make on 2/29/16.
 */
public class SelectionOperation implements Operation {
    @Override
    public String execute(String... s) {
        return s[0];
    }
}
