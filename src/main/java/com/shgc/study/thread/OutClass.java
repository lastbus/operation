package com.shgc.study.thread;

/**
 * Created by make on 2/17/16.
 */
public class OutClass
{

    private static String msg = "GeeksForGeeks";
    public String mm = "kkk";
    public InnerClass i = new InnerClass();

    // 静态内部类
    public static class NestedStaticClass
    {

        // 静态内部类只能访问外部类的静态成员
        public void printMessage() {

            // 试着将msg改成非静态的，这将导致编译错误
            System.out.println("Message from nested static class: " + msg);
        }
    }

    // 非静态内部类
    public class InnerClass
    {
        public  String a = "KKK";

        // 不管是静态方法还是非静态方法都可以在非静态内部类中访问
        public void display(){
            System.out.println("Message from non-static nested class: "+ msg);
            System.out.println("Message from non-static nested class: "+ mm);
        }
    }
}

class Main
{
    // 怎么创建静态内部类和非静态内部类的实例
    public static void main(String args[]){

        // 创建静态内部类的实例
        OutClass.NestedStaticClass printer = new OutClass.NestedStaticClass();

        // 创建静态内部类的非静态方法
        printer.printMessage();

        // 为了创建非静态内部类，我们需要外部类的实例
        OutClass outer = new OutClass();
        outer.new InnerClass();
        OutClass.InnerClass inner  = outer.new InnerClass();

        // 调用非静态内部类的非静态方法
        inner.display();

        // 我们也可以结合以上步骤，一步创建的内部类实例
        OutClass.InnerClass innerObject = new OutClass().new InnerClass();

        // 同样我们现在可以调用内部类方法
        innerObject.display();
    }
}
