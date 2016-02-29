package com.shgc.filterPattern;

/**
 * Created by make on 10/25/15.
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String maritalStatus, String gender, String name) {
        this.maritalStatus = maritalStatus;
        this.gender = gender;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public String getMaritalStatus() {
        return maritalStatus;
    }


    public String getGender() {
        return gender;
    }

}
