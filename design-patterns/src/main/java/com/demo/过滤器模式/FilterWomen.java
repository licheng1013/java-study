package com.demo.过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class FilterWomen implements Filter {

    @Override
    public List<User> meetCriteria(List<User> persons) {
        List<User> femalePersons = new ArrayList<User>();
        for (User person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}