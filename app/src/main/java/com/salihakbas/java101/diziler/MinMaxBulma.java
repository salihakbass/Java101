package com.salihakbas.java101.diziler;

public class MinMaxBulma {
    public static void main(String[] args) {
        int list[] = {42,3,2132,43,56,-45,-6,-443};
        int min = list[0];
        int max = list[0];

        for(int i : list) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        System.out.println("Minimum Değer : " + min);
        System.out.println("Maksimum Değer : " + max);
    }
}
