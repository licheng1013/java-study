package com.demo.备忘录模式;

import lombok.Data;

@Data
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}