package com.example08;

public class Circle implements Shape {
    private int r;

    public Circle(int r) {

        this.r = r;

    }

    @Override

    public int getPerimeter() {

        return 2 * 3 * r;

    }
}
