package com.struct.linked_list;

/**
 * @author lc
 * @since 2022/5/31
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Max");
        list.add("HashMap");
        list.add("Stock");
        list.add("SELECT");
        list.add("UPDATE");
        list.add("WHERE");
        list.add("GROUP");
        list.add("HAVING");
        list.add("COUNT");
        list.add("LIMIT");

        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
