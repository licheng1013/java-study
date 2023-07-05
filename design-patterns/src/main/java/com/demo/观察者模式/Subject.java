package com.demo.观察者模式;

import java.util.Observable;

public class Subject extends Observable {

    public Subject() {
        //jdk默认不通知
        this.setChanged();
    }

    public void setState(int state) {
        notifyObservers(state);
    }


}