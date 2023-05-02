package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class BasamakSayılarınıToplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        int basamakDegeri;
        int result = 0;

        while(number != 0) {
            basamakDegeri = number % 10;
            result += basamakDegeri;
            number /= 10;
        }
        System.out.println("Girilen sayının basamaklarının toplamı = " + result);
    }
}
