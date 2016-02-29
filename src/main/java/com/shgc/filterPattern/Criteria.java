package com.shgc.filterPattern;

import java.util.List;

/**
 * Created by make on 10/25/15.
 */
public interface Criteria {
    public List<Person> meetCeriteria(List<Person> persons);
}
