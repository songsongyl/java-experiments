package com.example01;

public class LeapYear {
    public static void main(String[] args){
        test(1900 , 2000);
    }
    private static void test(int startYear , int endYear){
        for (int i = startYear; i <= endYear; i++){
            if ((i % 4 == 0 && i % 100 !=0)||i % 400 == 0){
                System.out.println(i);
            }
        }
    }
}
