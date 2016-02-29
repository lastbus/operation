package com.shgc.filterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by make on 10/25/15.
 */
public class CriteriaPatternDemo {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CeriteriaMale();
        Criteria female = new CeriteriaFemale();
        Criteria single = new CeriteriaSingle();
        Criteria singleMale = new AndCeriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCeriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCeriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCeriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCeriteria(persons));
    }

    public static void printPersons(List<Person> persons){

        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }

    }
}
