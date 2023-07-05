package com.demo.java.ee.拦截过滤器模式;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lc
 * @since 2022/5/16
 */
@Data
public class FilterChain implements Filter {
    private final List<Filter> filters = new ArrayList<>();
    private Filter son;

    @Override
    public void execute() {
        for (Filter filter : filters) {
            filter.execute();
        }
        son.execute();
    }


}
