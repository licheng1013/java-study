package com.demo.抽象工厂模式.entity;

import com.demo.抽象工厂模式.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}