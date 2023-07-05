package com.demo.抽象工厂模式;

import com.demo.抽象工厂模式.impl.FactoryProducer;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //产品工厂
        AbstractFactory factory = FactoryProducer.getFactory(ProductEnum.COLOR);
        Color color = factory.getColor(ColorEnum.RED);
        color.fill();


    }
}