package com.struct.hash;

import lombok.Data;

/**
 * @author lc
 * @since 2022/5/28
 */
public class Hash<K,V> {
    private  static final int DEFAULT_LENGTH = 16;
    private  final float DEFAULT_LOAD_FACTOR = 0.75f;
    private int size = 0;
    private int threshold;
    private Node<K,V>[] tables;


    public Hash(int size) {
        tables = (Node<K, V>[]) new Node[size];
        threshold = (int) (tables.length * DEFAULT_LOAD_FACTOR);
        System.out.println("临界点："+ threshold);

    }

    public Hash() {
        this(DEFAULT_LENGTH);
    }

    @Data
    static class Node<K,V>{
        private K key;
        private V value;
        private Node<K,V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public void  put(K k,V v){
        putVal(k,v, tables);
    }

    private void putVal(K k, V v, Node<K,V>[] table) {
        int i = getIndex(k, table.length);
        System.out.println(i);
        Node<K, V> node = table[i];
        if (node == null) {
            size++;
        }
        if (size>= tables.length * DEFAULT_LOAD_FACTOR)
            resize();

        table[i] = new Node<>(k, v);
    }

    public int size(){
        return size;
    }

    private void resize() {
        Node<K,V> [] table = (Node<K,V> [])new Node[tables.length << 1];
        for (Node<K, V> node : tables) {
            if (node != null) {
                int i = getIndex(node.key, table.length);
                table[i] = node;
            }
        }
        tables = table;
        threshold = (int) (table.length * DEFAULT_LOAD_FACTOR);
        System.out.println("临界点："+ threshold);
    }

    private int  getIndex(K k,int listLength){
        //return  listLength - 1 & k.hashCode() ^ k.hashCode() >>> 16;
        return Math.abs(k.hashCode() % listLength);
    }



    public V get(K k){
        return tables[getIndex(k, tables.length)].value ;
    }

}
