package com.demo.抽象工厂模式.impl;

import com.demo.抽象工厂模式.AbstractFactory;
import com.demo.抽象工厂模式.ProductEnum;

public class FactoryProducer {
    public static AbstractFactory getFactory(ProductEnum p) {
        if (p == ProductEnum.SHAPE) {
            return new ShapeFactory();
        } else if (p == ProductEnum.COLOR) {
            return new ColorFactory();
        }
        return null;
    }


}