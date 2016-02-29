package com.shgc.visitorPattern;

/**
 * Created by make on 10/27/15.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
