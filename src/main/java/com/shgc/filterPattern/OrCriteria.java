package com.shgc.filterPattern;

import java.util.List;

/**
 * Created by make on 10/25/15.
 */
public class OrCriteria implements Criteria {
    private Criteria ceriteria;
    private Criteria otherCerteria;

    public OrCriteria(Criteria otherCerteria, Criteria ceriteria) {
        this.otherCerteria = otherCerteria;
        this.ceriteria = ceriteria;
    }

    @Override
    public List<Person> meetCeriteria(List<Person> persons) {
        List<Person> firstCriteriaPersion = ceriteria.meetCeriteria(persons);
        List<Person> otherCriteriaPerson = otherCerteria.meetCeriteria(persons);

        for (Person person : persons){
            if (!firstCriteriaPersion.contains(person)){
                firstCriteriaPersion.add(person);
            }
        }
        return firstCriteriaPersion;
    }
}
