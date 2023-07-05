package com.struct.linked_list;

import lombok.ToString;

/**
 * @author lc
 * @since 2022/5/31
 */
@ToString
public class LinkedList<T> {
    private int size;
    private Node<T> linked;
    @ToString
    static class Node<T>{
        T value;
        Node<T> prev;
        Node<T> next;

        public Node(T value, Node<T> prev, Node<T> next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

    public void add(T t){
        ++size;
        Node<T> l = linked;
        //构建这个对象，传入上一个对象的指针，
        // 通过复制获取新对象的指针 和 内部保存的上一个对象的指针
        linked = new Node<>(t, l, null);
    }

    //删除
    public void  remove(T t){

    }

    public void  removeAll(T t){

    }

    public T  get(int index){
       Node<T> x = linked;
        if (size <= index) {
            throw new RuntimeException("下标越界");
        }
        for (int i=0; i<index;i++)
            x = x.prev;
        return x.value;
    }



}
