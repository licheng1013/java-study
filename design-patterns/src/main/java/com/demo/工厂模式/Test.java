package com.demo.工厂模式;

/**
 * @author lc
 * @since 2022/5/13
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory.getInstance("AliPay").print();
    }


}
