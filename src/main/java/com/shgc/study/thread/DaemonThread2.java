package com.shgc.study.thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by make on 2/2/16.
 */
public class DaemonThread2 implements Runnable{

    public  void run(){
        try{
            System.out.println("Starting ADamon");
            TimeUnit.SECONDS.sleep(1);
        }
        catch(InterruptedException e){
            System.out.println("err");
        }
        finally{
            System.out.println("This should always run?");
        }
    }

    public static void main(String[] args){
        Thread t = new Thread(new DaemonThread2());
        t.setDaemon(true);
        t.start();
    }


}
