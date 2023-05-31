package com.salihakbas.java101.diziler;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakınSayılar {
    public static void main(String[] args) {
        int list[] = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        int value = input.nextInt();

        int min = 0;
        int max = 0;
        Arrays.sort(list);

        for(int i : list) {
            if(i < value) {
                min = i;
            }
            if(i > value) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
