package com.struct.queue;

/**
 * @author lc
 * @since 2022/5/31
 */
public class Main {
    public static void main(String[] args) {
        Queue<String> stock = new Queue<>();

        stock.push("Hello");
        stock.push("World");
        System.out.println(stock.pop());
        System.out.println(stock.pop());
    }
}
