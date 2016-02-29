package com.shgc.visitorPattern;

/**
 * Created by make on 10/27/15.
 */
public class Keyboard implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
