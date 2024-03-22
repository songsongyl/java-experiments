package com.example02;

public class Student {
    private String name;
    private String sex;
    public enum Sex{
        MALE, FEMALE
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return sex;
    }
}
