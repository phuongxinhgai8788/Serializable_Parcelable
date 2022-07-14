package com.example.serializablesample;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name;
    private int age;
    private String phoneNumber;

    public Employee(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
