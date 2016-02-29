package com.shgc.study.thread;

/**
 * Created by make on 2/2/16.
 */
public class DaemonThread extends Thread {

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) throws Exception{
        DaemonThread dt = new DaemonThread();
        dt.setDaemon(true); //设为后台线程，需要在启动之前设置
        dt.start();
        for(int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        //可以看到在main线程结束自后，Daemon线程也结束了
    }


}
