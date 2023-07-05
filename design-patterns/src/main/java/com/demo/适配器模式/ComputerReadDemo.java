package com.demo.适配器模式;

import com.demo.适配器模式.impl.ComputerIpml;
import com.demo.适配器模式.impl.SDAdapterTF;
import com.demo.适配器模式.impl.SDCardImpl;
import com.demo.适配器模式.impl.TFCardImpl;

public class ComputerReadDemo {
    public static void main(String[] args) {
        Computer computer = new ComputerIpml();
        SDCard sdCard = new SDCardImpl();
        System.out.println(computer.readSD(sdCard));

        System.out.println("====================================");
        TFCard tfCard = new TFCardImpl();
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
    }
}