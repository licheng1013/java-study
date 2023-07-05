package com.demo.工厂模式.entity;

import com.demo.工厂模式.Factory;

public class AliPay implements Factory {

    @Override
    public void print() {
        System.out.println(this.getClass().getName());
    }
}