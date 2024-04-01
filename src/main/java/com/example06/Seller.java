package com.example06;

public class Seller extends Employee{
    private double count;
    private double commission;
    public double calculateSalary(double salary){
        return salary + count * commission;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public Seller(String name, double salary, double count, double commission) {
        super(name, salary);
        this.count = count;
        this.commission = commission;
    }
}
