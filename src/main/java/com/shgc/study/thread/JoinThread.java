package com.shgc.study.thread;

/**
 * Created by make on 2/2/16.
 */
public class JoinThread extends Thread {

    public JoinThread(String name){
        super(name);
    }

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) throws Exception{

        for(int i=0; i<10;i++){
            if(i==1){
                JoinThread jt = new JoinThread("被Join的线程");
                jt.start();

                //main线程调用了jt线程的Join()方法，则main线程
                //只有等jt结束后，main线程才会继续进行
                jt.join();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }


}
