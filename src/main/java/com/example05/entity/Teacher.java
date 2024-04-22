package com.example05.entity;

public class Teacher {
    private int id;
    private String name;
    private College college;

    public Teacher(int id, String name, College college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return college;
    }

}
