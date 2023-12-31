package com.demo.责任链模式;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println(this.level + " : " + message);
    }
}