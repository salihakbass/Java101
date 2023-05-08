package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int adet, sayı ;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        adet = input.nextInt();

        for(int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayı = input.nextInt();

            if(sayı > max) max = sayı;
            if(sayı < min) min = sayı;
        }
        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer: " + min);

    }
}
