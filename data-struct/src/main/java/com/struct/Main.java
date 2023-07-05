package com.struct;


import java.util.LinkedList;

/**
 * @author lc
 * @since 2022/5/28
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(16 << 1);
        System.out.println( "K".hashCode() ^ "K".hashCode() >>> 16);

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
