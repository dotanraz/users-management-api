package com.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private String firstName;
    private String lastName;
    private double weight;
    private long dateOfBirth;
    private int id;

//    public User(@JsonProperty("firstName") String firstName,
//                @JsonProperty("lastName") String lastName,
//                @JsonProperty("weight")double weight,
//                @JsonProperty("dateOfBirth")long dateOfBirth) {
    public User(String firstName, String lastName, double weight, long dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    public User(String firstName, String lastName, double weight, long dateOfBirth, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
