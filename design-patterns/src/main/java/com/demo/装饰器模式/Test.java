package com.demo.装饰器模式;

/**
 * @author lc
 * @since 2022/5/13
 */
public class Test {

    public static void main(String[] args) {
        AA aa = new AA();
        BB bb = new BB(aa);
        aa.print();
        System.out.println();
        bb.print();
    }
}
