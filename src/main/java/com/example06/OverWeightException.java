package com.example06;

public class OverWeightException extends Exception{
    private int id;
    private String name;
    private double overweight;

    public OverWeightException( int id, String name, double overweight){
       // super(message);
        this.id = id;
        this.name = name;
        this.overweight = overweight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getOverweight() {
        return overweight;
    }
    public String getMessage(){
        return id + " " + name + " " + overweight;
    }

}
