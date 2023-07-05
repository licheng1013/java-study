package com.struct.stock;

import java.util.ArrayList;

/**
 * 利用ArrayList构建一个简单的栈
 * @author lc
 * @since 2022/5/31
 */
public class Stock<T>{
    private final ArrayList<T> list;

    public Stock() {
        list = new ArrayList<>();
    }

    public void  push(T t){
        list.add(t);
    }

    public T pop(){
        return list.remove(list.size()-1);
    }
}
