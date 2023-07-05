package com.demo.java.ee.拦截过滤器模式;

/**
 * @author lc
 * @since 2022/5/16
 */
public class Dad implements Filter {

    @Override
    public void execute() {
        System.out.println("Dad检查作业");
    }
}
