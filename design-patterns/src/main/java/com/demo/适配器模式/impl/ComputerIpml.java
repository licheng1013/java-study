package com.demo.适配器模式.impl;

import com.demo.适配器模式.Computer;
import com.demo.适配器模式.SDCard;

public class ComputerIpml implements Computer {
    @Override
    public String readSD(SDCard sdCard) {
        if (sdCard == null) throw new NullPointerException("sd card null");
        return sdCard.readSD();
    }
}