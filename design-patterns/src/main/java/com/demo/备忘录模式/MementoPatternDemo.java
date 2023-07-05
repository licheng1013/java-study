package com.demo.备忘录模式;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");
        System.out.println("当前状态: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("副本: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("副本: " + originator.getState());
    }
}