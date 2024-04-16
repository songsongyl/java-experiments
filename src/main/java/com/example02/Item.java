package com.example02;

public class Item {
    private int count;
    private Product product;

    public Item(int count, Product product) {
        this.count = count;
        this.product = product;
    }

    public int getCount() {
        return count;
    }

    public Product getProduct() {
        return product;
    }

}
