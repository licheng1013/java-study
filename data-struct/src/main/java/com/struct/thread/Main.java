package com.struct.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lc
 * @since 2022/6/2
 */
public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor thread = new ThreadPoolExecutor(10, 20
                , 20, TimeUnit.MINUTES, new LinkedBlockingQueue<>(100));
        A a = new A();

        for (int i = 0; i < 100; i++) {
            thread.execute(a::add);
        }

    }

}

class A{
    int i;
    volatile  int c;

    public  void add(){
        //int c = i;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (this){
            i++;
        }
        System.out.println(i);
    }
}
