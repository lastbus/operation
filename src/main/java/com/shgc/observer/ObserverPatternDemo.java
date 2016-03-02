package com.shgc.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 不足和隐患
 * 1. observable 持有 observer 的引用，如果未正常处理从主题中删除 observer，会导致 observer 无法被回收。
 * 2. 如果 observer 具体实现代码有问题，会导致 observable 和 observer 对象形成循环引用，在某些采用引用计数的垃圾回收器可能导致无法回收。
 * Created by make on 1/26/16.
 */
public class ObserverPatternDemo {

    public static void main(String args[]){
        Observer consumer = new Consumer();
        MilkProvider milkProvider = new MilkProvider();
        milkProvider.addObserver(consumer);
        milkProvider.sendMilk();

    }

    static class MilkProvider extends Observable {

        public void sendMilk(){
            setChanged();
            notifyObservers(this);
        }

        public int getInt(){
            return 100;
        }

    }


    static class Consumer implements Observer {


        public void update(Observable o, Object arg) {
            MilkProvider m = (MilkProvider) arg;
            System.out.println("haa, thank you for providing milk for us." + o + " , " + m.getInt());
        }
    }

}
