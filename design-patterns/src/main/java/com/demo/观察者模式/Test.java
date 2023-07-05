package com.demo.观察者模式;

/**
 * @author lc
 * @since 2022/5/13
 */
public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new A(subject);
        new B(subject);
        subject.setState(15);
        subject.setState(10);
    }

}
