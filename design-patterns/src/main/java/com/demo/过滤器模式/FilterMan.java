package com.demo.过滤器模式;

import java.util.ArrayList;
import java.util.List;

public class FilterMan implements Filter {

    @Override
    public List<User> meetCriteria(List<User> persons) {
        List<User> malePersons = new ArrayList<User>();
        for (User person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}