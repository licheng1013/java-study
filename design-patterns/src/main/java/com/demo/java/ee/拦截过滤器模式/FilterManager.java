package com.demo.java.ee.拦截过滤器模式;

import lombok.Data;

@Data
public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Filter target) {
        filterChain = new FilterChain();
        filterChain.setSon(target);
    }

    public void setFilter(Filter filter) {
        filterChain.getFilters().add(filter);
    }

    public void filterRequest() {
        filterChain.execute();
    }
}