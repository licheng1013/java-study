package com.demo.适配器模式.impl;

import com.demo.适配器模式.TFCard;

public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        return "tf card reade msg : hello word tf card";
    }

    @Override
    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}