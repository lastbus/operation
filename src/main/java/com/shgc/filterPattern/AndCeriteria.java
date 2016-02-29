package com.shgc.filterPattern;

import java.util.List;

/**
 * Created by make on 10/25/15.
 */
public class AndCeriteria implements Criteria {
    private Criteria ceriteria;
    private Criteria otherCerteria;

    public AndCeriteria(Criteria ceriteria, Criteria otherCerteria) {
        this.ceriteria = ceriteria;
        this.otherCerteria = otherCerteria;
    }

    @Override
    public List<Person> meetCeriteria(List<Person> persons) {
        List<Person> firstCeriteriaPersons = ceriteria.meetCeriteria(persons);
        return otherCerteria.meetCeriteria(firstCeriteriaPersons);
    }
}
