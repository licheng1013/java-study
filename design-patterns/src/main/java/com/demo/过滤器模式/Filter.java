package com.demo.过滤器模式;

import java.util.List;

public interface Filter {
    List<User> meetCriteria(List<User> persons);
}

