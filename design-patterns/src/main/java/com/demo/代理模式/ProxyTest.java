package com.demo.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lc
 * @since 2022/6/8
 */
public class ProxyTest {
    public static void main(String[] args) throws Exception {
        Mapper m = id -> { //实现类
            System.out.println("HelloWorld");
            return null;
        };
        Mapper mapper = (Mapper) Proxy.newProxyInstance(Mapper.class.getClassLoader(), new Class[]{Mapper.class}
                , new ProxyMapper(m));
        System.out.println(mapper.selectOne("1"));
    }
}
interface Mapper{
    String selectOne(String id);
}
class ProxyMapper implements InvocationHandler{
    public Object pro;

    public ProxyMapper(Object pro) {
        this.pro = pro;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("拦截执行！");
        System.out.println("获取方法名："+method.getName());
        return method.invoke(pro, args);
    }
}