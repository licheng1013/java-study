package com.demo.代理模式;

import lombok.Data;

/**
 * @author lc
 * @since 2022/5/16
 */
@Data
public class ProxyStudent implements School {
    public School proxyTarget;


    @Override
    public void print() {
        if (proxyTarget == null) {
            this.proxyTarget = new Student();
        }
        System.out.println("起床吃饭");
        proxyTarget.print();
        System.out.println("回家吃饭");
    }
}
