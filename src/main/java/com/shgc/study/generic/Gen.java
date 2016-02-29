package com.shgc.study.generic;

import java.util.Objects;

/**
 * Created by make on 2/23/16.
 */
public class Gen<T>
{
    T ob;

    Gen(T o)
    {
        ob = o;
    }

    T getOb()
    {
        return ob;
    }

    void showType()
    {
        System.out.println("Type of T is " + ob.getClass().getName());
    }

}

class NonGen
{
    Object ob;

    NonGen(Object o)
    {
        ob = o;
    }

    Object getOb()
    {
        return ob;
    }

    void showType()
    {
        System.out.println("Type of T is " + ob.getClass().getName());
    }

}
