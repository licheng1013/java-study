package com.demo.空对象模式.impl;

import com.demo.空对象模式.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}