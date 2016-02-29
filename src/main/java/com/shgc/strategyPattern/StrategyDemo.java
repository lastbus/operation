package com.shgc.strategyPattern;

/**
 * Created by make on 2/29/16.
 */
public class StrategyDemo {

    public static void main(String[] args) throws Exception {
        OperationFactory operationFactory = new OperationFactory();
        operationFactory.addCommandOperation("select", new SelectionOperation());
        operationFactory.addCommandOperation("substring", new SubstringOperation());
        OperationContext operationContext = new OperationContext(operationFactory.getOperationMap());


        System.out.println(operationContext.execute(Command.SELECT, "abc"));
        System.out.println(operationContext.execute(Command.SUBSTRING, "abc", "3"));



    }
}
