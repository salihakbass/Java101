package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class TekSayı {
    public static void main(String[] args) {
        int sayı, toplam = 0;

        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Bir sayı giriniz: ");
            sayı = input.nextInt();

            if(sayı % 2 == 0 && sayı % 4 == 0) {
                toplam += sayı;
            }
        }while (sayı % 2 == 0);

        System.out.println("Tek sayı girilene kadar girilen değerlerin çift ve 4'ün katı olanlarının toplamı: " + toplam);

    }
}
