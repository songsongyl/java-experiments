package com.example05;

public class F implements I{
    public void getF() {
        System.out.println("F getF");
    }
    @Override
    public void getI() {
        System.out.println("F getI");
    }
}
