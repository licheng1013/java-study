package com.demo.抽象工厂模式.entity;

import com.demo.抽象工厂模式.Color;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("红色");
    }
}