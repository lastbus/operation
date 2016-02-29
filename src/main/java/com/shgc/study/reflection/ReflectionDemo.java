package com.shgc.study.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by make on 2/21/16.
 */
public class ReflectionDemo
{

    public static void main(String args[]) throws ClassNotFoundException
    {
        Class<?> c = Class.forName("java.awt.Dimension");

        println("Constructors");
        Constructor<?>[] constructor = c.getConstructors();
        for (Constructor constructor1 : constructor)println(" " + constructor1);

        println("Fields:");
        Field[] field = c.getFields();
        for (Field field1 : field)println(" " + field1);

        println("Methods:");
        Method method[] = c.getMethods();
        for (Method method1 : method)println(" " + method1);


    }

    private static void println(String s)
    {
        System.out.println(s);
    }
}
