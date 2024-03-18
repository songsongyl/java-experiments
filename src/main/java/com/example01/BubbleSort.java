package com.example01;

public class BubbleSort {
    public static void main(String[] args){
        sort();
    }
    private static void sort(){
        int[] eg = {2, 5, 8, 77, 12};
        for (int i = 0;i < eg.length - 1;i++){
            for(int j = i + 1;j < eg.length ;j++){
                if (eg[i] > eg[j]){
                    int temp = eg[i];
                    eg[i] = eg[j];
                    eg[j] = temp;
                }
            }
        }
        for (int i = 0;i <eg.length;i++) {
            System.out.println(eg[i]);
        }
    }
}
