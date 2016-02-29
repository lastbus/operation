package com.shgc.study.generic;

/**
 * Created by make on 2/23/16.
 */
public class GenDemo
{

    public static void main(String[] args)
    {
//        Gen<Integer> iOb;
//        iOb = new Gen<Integer>(88);
//        iOb.showType();
//        int v = iOb.getOb();
//        System.out.println("value: " + v);
//
//        Gen<String> strOb = new Gen<String>("Generic test");
//        strOb.showType();
//        String str = strOb.getOb();
//        System.out.println("value: " + str);


        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("value: " + v);

        NonGen strOb = new NonGen("Non-Generic test");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("value: " + str);


    }
}
