package com.shgc.study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by make on 2/2/16.
 */
public class SecondThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            println(Thread.currentThread().getName() + "  " + i);
        }
    }

    public static void main(String args[]){
        for (int i = 0; i < 10; i++){
            println(Thread.currentThread().getName() + "  " + i);
            if(i == 0){
                ExecutorService exec = Executors.newCachedThreadPool();
                exec.execute(new Thread(new SecondThread(), "new 2"));
                exec.shutdown();
            }

        }


    }




    public static void println(String s){
        System.out.println(s);
    }
}
