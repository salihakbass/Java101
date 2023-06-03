package com.salihakbas.java101.diziler;

import java.util.Arrays;

public class ElemanFrekansı {

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20} ;
        int count = 1;

        Arrays.sort(list);

        for(int i = 0 ; i < list.length; i++) {
            //ilk indis kontrolü
            if(i == 0) {
                for(int j = 0; j < list.length; j++) {
                    if((i != j) && (list[i] == list[j])) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi");
            }else if(list[i] != list[i-1]) {
                for(int j = 0; j < list.length; j++) {
                    if((i != j) && (list[i] == list[j])) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi");
            }
            count = 1;

        }



    }
}
