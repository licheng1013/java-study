package com.demo.java.ee.拦截过滤器模式;

/**
 * @author lc
 * @since 2022/5/16
 */
public class Test {
    public static void main(String[] args) {
        FilterManager manager = new FilterManager(new Son());
        manager.setFilter(new Mom());
        manager.setFilter(new Dad());
        manager.filterRequest();
    }
}
