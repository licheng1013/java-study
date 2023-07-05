package com.struct.linked_list;

import lombok.ToString;

/**
 * @author lc
 * @since 2022/5/31
 */
@ToString
public class A<T> {
    @ToString
    static class Node<T>{
         T value;
         Node<T> next;
         Node<T> prev;

        public Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node<T> last;
    private  Node<T> node;
    private Node<T> next;
    public void  add(T t){
        //第一个进来全空
        node = new Node<>(t,last,null);
        last = node;
    }

    public static void main(String[] args) {
        A<String> a = new A<>();
        a.add("A");
        a.add("B");
        System.out.println(a);
    }
}
