package com.example10.entity;

public class Student {
    public enum Sex{
        MALE,FEMALE
    }
    private int id;
    private String name;
    private Sex sex;
    int year;

    public Student(int id, Sex sex, String name, int year) {
        this.id = id;
        this.sex = sex;
        this.name = name;
        this.year = year;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getYear() {
        return year;
    }
}
