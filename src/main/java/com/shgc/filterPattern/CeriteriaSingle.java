package com.shgc.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by make on 10/25/15.
 */
public class CeriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCeriteria(List<Person> persons) {
        List<Person> singlePerson = new ArrayList<Person>();
        for(Person person : persons){
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePerson.add(person);
            }
        }
        return singlePerson;
    }
}
