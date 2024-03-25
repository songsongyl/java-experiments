package com.example03;

public class Order {
    private User user;
    private Item[] items;
    private double cost;

    public Order(User user, Item[] items, double cost) {
        this.user = user;
        this.items = items;
        this.cost = cost;
    }
    public double getCost() {
        return cost;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
