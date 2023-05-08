package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class MükemmelSayı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        System.out.print("Bir sayı giriniz: ");
        int sayı = input.nextInt();

        for(int i = 1; i < sayı; i++) {
            if(sayı % i == 0) {
                toplam += i;
            }
        }
        if(toplam == sayı) {
            System.out.println(sayı +  " sayısı bir mükemmel sayıdır.");
        }else{
            System.out.println(sayı + " sayısı bir mükemmel sayı değildir.");
        }

    }
}
