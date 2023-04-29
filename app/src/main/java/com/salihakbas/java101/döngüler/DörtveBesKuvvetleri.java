package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class DörtveBesKuvvetleri {
    public static void main(String[] args) {
        int sayı;

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayı = input.nextInt();

        for(int i = 1; i <= sayı; i *= 4) {
            System.out.println("4 ün kuvvetleri: " + i);
        }

        for(int j = 1; j <= sayı; j *= 5) {
            System.out.println("5 in kuvvetleri: " + j);
        }
    }
}
