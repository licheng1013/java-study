package com.demo.抽象工厂模式.entity;

import com.demo.抽象工厂模式.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("绿色");
    }
}