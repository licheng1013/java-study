package com.demo.享元模式;

import java.util.HashMap;
import java.util.Random;

/**
 * @author lc
 * @since 2022/5/16
 */
public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Color> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int key = new Random().nextInt(5);
            Color color = map.get(key);
            if (color == null) {
                color = new Color();
                color.setType(key);
                map.put(key, color);
                System.out.println("创建对象: " + key);
            }
            color.setNum(new Random().nextInt(10));
            System.out.println(color);
        }
    }
}
