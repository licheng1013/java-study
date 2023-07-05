package com.demo.代理模式;

/**
 * @author lc
 * @since 2022/5/16
 */
public class Student implements School {
    @Override
    public void print() {
        System.out.println("回学校");
    }
}
