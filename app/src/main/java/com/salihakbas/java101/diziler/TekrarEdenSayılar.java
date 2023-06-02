package com.salihakbas.java101.diziler;

import java.util.Arrays;

public class TekrarEdenSayılar {
    static boolean isFind(int[] arr, int value) {
       for(int i : arr) {
           if(i == value) {
               return true;
           }
       }
       return false;
    }
    public static void main(String[] args) {
        int[] list = {1,23,43,1,2,4,2,5,7,43,14};
        int[] duplicate = new int[list.length];
        int startİndex = 0;

        for(int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if((i != j) && (list[i] == list[j])) {
                    if(!isFind(duplicate,list[i])) {
                        duplicate[startİndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for(int value : duplicate) {
            if(value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
