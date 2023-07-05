package com.demo.桥接模式;

import com.demo.桥接模式.impl.Circle;
import com.demo.桥接模式.impl.GreenCircle;
import com.demo.桥接模式.impl.RedCircle;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}