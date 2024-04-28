package com.example06.entity;

public class Ship {
    private int id;
    private String name;
    private double weightAll;
    private Container[] containers;
//    private List<Container> containerList;
//
//    public Ship(int id, String name, double weightAll, List<Container> containerList) {
//        this.id = id;
//        this.name = name;
//        this.weightAll = weightAll;
//        this.containerList = containerList;
//    }

    public Ship(int id, String name, double weightAll, Container[] containers) {
        this.id = id;
        this.name = name;
        this.weightAll = weightAll;
        this.containers = containers;
    }

    public double getWeightAll() {
        return weightAll;
    }

    public void setContainers(Container[] containers) {
        this.containers = containers;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Container[] getContainers() {
        return containers;
    }
}
