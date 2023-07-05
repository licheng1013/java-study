package com.demo.观察者模式;

import java.util.Observable;
import java.util.Observer;

public class B implements Observer {

    public B(Subject o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.getClass().getName() + ":" + arg);
    }
}