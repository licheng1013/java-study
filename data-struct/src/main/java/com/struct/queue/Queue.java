package com.struct.queue;

import java.util.ArrayList;

/**
 * @author lc
 * @since 2022/5/31
 */
public class Queue<T> {
    private final ArrayList<T> list;

    public Queue() {
        list = new ArrayList<>();
    }

    public void  push(T t){
        list.add(t);
    }

    public T pop(){
        return list.remove(0);
    }
}
