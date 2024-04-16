package com.example03;

public class Employee implements Workable{
    private String name;
    private double salary;
    public void updateName(String name){
        this.name = name;
    }

    public double calculateSalary(double salary){
       return salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
