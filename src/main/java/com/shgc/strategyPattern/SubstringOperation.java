package com.shgc.strategyPattern;

/**
 * Created by make on 2/29/16.
 */
public class SubstringOperation implements Operation {
    @Override
    public String execute(String... s) {
        return s[0].substring(Integer.valueOf(s[1]));
    }
}
