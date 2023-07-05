package com.demo.装饰器模式;

/**
 * @author lc
 * @since 2022/5/13
 */
public class BB extends B {

    public BB(A a) {
        super(a);
    }

    @Override
    public void print() {
        this.a.print();
        System.out.println("装饰后的功能");
    }
}
