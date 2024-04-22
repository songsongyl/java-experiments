package com.example05.entity;

public class Student {
    private int id;
    private String name;
    private String grade;
    private Teacher teacher;

    public Student(int id, String name, String grade, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public Teacher getTeacher() {
        return teacher;
    }
}
