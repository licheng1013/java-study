package com.demo.装饰器模式;

/**
 * @author lc
 * @since 2022/5/13
 */
public abstract class B implements A {

    protected A a;

    public B(A a) {
        this.a = a;
    }

    @Override
    public void print() {
        a.print();
    }
}
