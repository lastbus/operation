package com.shgc.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by make on 10/25/15.
 */
public class CeriteriaMale implements Criteria {

    @Override
    public List<Person> meetCeriteria(List<Person> persons) {
        List<Person> malePsersion = new ArrayList<Person>();

        for (Person person : persons){
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePsersion.add(person);
            }
        }
        return malePsersion;

    }
}
