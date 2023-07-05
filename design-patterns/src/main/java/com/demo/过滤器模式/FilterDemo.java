package com.demo.过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<User> persons = new ArrayList<>();
        persons.add(new User("Diana", "Female", "Single"));
        persons.add(new User("Laura", "Female", "Married"));
        persons.add(new User("Robert", "Male", "Single"));
        persons.add(new User("John", "Male", "Married"));
        persons.add(new User("Mike", "Male", "Single"));
        persons.add(new User("Bobby", "Male", "Single"));

        Filter female = new FilterWomen();
        Filter male = new FilterMan();
        Filter singleMale = new FilterWomen();

        System.out.println("过滤男性: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("过滤女性: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("过滤单身男性: ");
        printPersons(singleMale.meetCriteria(persons));

    }

    public static void printPersons(List<User> persons) {
        for (User person : persons) {
            System.out.println(person.toString());
        }
    }
}