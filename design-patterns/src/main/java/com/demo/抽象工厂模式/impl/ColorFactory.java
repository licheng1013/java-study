package com.demo.抽象工厂模式.impl;

import com.demo.抽象工厂模式.*;
import com.demo.抽象工厂模式.entity.Green;
import com.demo.抽象工厂模式.entity.Red;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeEnum shape) {
        return null;
    }

    @Override
    public Color getColor(ColorEnum color) {
        if (color == null) {
            return null;
        }
        if (ColorEnum.RED == color) {
            return new Red();
        } else if (ColorEnum.GREEN == color) {
            return new Green();
        }
        return null;
    }
}