package com.demo.java.ee.拦截过滤器模式;

/**
 * @author lc
 * @since 2022/5/16
 */
public class Mom implements Filter {

    @Override
    public void execute() {
        System.out.println("Mom检查作业");
    }
}
