package com.struct.stock;

/**
 * @author lc
 * @since 2022/5/31
 */
public class Main {
    public static void main(String[] args) {
        Stock<String> stock = new Stock<>();

        stock.push("Hello");
        stock.push("World");
        System.out.println(stock.pop());
        System.out.println(stock.pop());
    }
}
