package com.shgc.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by make on 10/25/15.
 */
public class CeriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCeriteria(List<Person> persons) {
        List<Person> femalPerson = new ArrayList<Person>();

        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                femalPerson.add(person);
            }
        }
        return femalPerson;
    }
}
