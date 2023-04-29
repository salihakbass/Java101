package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class CiftSayı {
    public static void main(String[] args) {
        int sayı, toplam = 0, uzunluk = 0, ortalama ;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayı = input.nextInt();

        for(int i = 0; i <= sayı; i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                uzunluk++;
            }
        }
        ortalama = toplam / uzunluk;
        System.out.println("Ortalama: " + ortalama);
        
    }
}
