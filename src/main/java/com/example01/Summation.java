package com.example01;

public class Summation {
    public static void main(String[] args){
        double n = 5;
        int repeat = 4;
        double result = 0;
        double current = 0;
        for (int i = 0;i < repeat; i++){
            current = current + n * Math.pow(10, i);
            result = result +current;
        }
        System.out.println(result);
    }
}
