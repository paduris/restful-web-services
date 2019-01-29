package com.master.spring.restful.webservices.filtering;

import com.fasterxml.jackson.annotation.JsonFilter;


@JsonFilter("personFilter")
public class Person {


    private String firstName;
    private String lastName;
    private String midName;

    public Person(String firstName, String lastName, String midName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.midName = midName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }
}
