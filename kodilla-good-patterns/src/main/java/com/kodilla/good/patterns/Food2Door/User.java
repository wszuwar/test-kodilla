package com.kodilla.good.patterns.Food2Door;

public class User {
    private String name;
    private String lastName;
    private int phoneNumber;

    public User(String name, String lastName, int phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
