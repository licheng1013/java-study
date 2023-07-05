package com.demo.抽象工厂模式.impl;

import com.demo.抽象工厂模式.*;
import com.demo.抽象工厂模式.entity.Rectangle;
import com.demo.抽象工厂模式.entity.Square;

public class ShapeFactory extends AbstractFactory {


    @Override
    public Color getColor(ColorEnum color) {
        return null;
    }

    @Override
    public Shape getShape(ShapeEnum shape) {
        if (shape == null) {
            return null;
        }
        if (ShapeEnum.RECTANGLE == shape) {
            return new Rectangle();
        } else if (ShapeEnum.SQUARE == shape) {
            return new Square();
        }
        return null;
    }


}