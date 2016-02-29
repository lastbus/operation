package com.shgc.study.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by make on 2/2/16.
 */
public class FirstThread extends Thread {

    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            println(getName() + "  " + i);
        }
    }

    public static void main(String args[]){
        for(int i = 0; i < 10; i++){

            println(Thread.currentThread().getName() + "  " + i);
            if(i == 1){
                ExecutorService executorService = Executors.newCachedThreadPool();
                executorService.execute(new FirstThread());
                executorService.shutdown();
            }
        }

    }


    public static void println(String mesage){
        System.out.println(mesage);
    }
}
