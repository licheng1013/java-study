package com.demo.过滤器模式;


import lombok.Data;

@Data
public class User {

    private String name;
    private String gender;
    private String maritalStatus;

    public User(String name, String gender, String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }


}