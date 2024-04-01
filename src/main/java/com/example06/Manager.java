package com.example06;

public class Manager extends Employee{
    private int level;
    public Manager(String name, double salary, int level) {
        super(name, salary);
        this.level = level;
    }

    public double calculateSalary(double salary){
        super.setSalary(super.getSalary() * level *0.8);
        return super.getSalary();
        //return salary*level*0.8;
    }


}
