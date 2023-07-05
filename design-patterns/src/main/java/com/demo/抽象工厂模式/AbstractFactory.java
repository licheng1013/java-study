package com.demo.抽象工厂模式;

public abstract class AbstractFactory {
    public abstract Color getColor(ColorEnum color);

    public abstract Shape getShape(ShapeEnum shape);
}