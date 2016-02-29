package com.shgc.study.thread;


import java.util.concurrent.*;

/**
 * Created by make on 2/2/16.
 */
public class CallbackThread implements Callable {
    private static int i = 0;

    public static void main(String[] args) {

        CallbackThread callbackThread = new CallbackThread();
        FutureTask<Integer> task = new FutureTask<Integer>(callbackThread);
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            if (i == 1) {
                ExecutorService executorService = Executors.newSingleThreadExecutor();
                executorService.execute(task);
                executorService.shutdown();
            }
        }


        try {
            System.out.println("retrun " + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Object call() throws Exception {
        for (i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
        return i;
    }
}
