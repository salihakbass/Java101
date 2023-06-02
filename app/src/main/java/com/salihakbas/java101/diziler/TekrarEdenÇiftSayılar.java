package com.salihakbas.java101.diziler;

import java.util.Arrays;

public class TekrarEdenÇiftSayılar {
    static boolean isFind(int[] arr, int value) {
        for(int i : arr) {
            if(i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 4, 3, 2, 4, 8, 3, 12, 2, 54, 12, 32, 33, 1, 33};
        int duplicate[] = new int[list.length];
        int startİndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0) {
                        if(!isFind(duplicate,list[i])) {
                            duplicate[startİndex++] = list[i];
                        }
                        break;
                    }

                }
            }
        }
        for(int value : duplicate) {
            if(value != 0) {
                System.out.println(value);
            }
        }
    }
}
