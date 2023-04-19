package com.salihakbas.java101;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args)  {
        int num1, num2, select;

        Scanner numbers = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        num1 = numbers.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        num2 = numbers.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.print("Seçiminiz: ");
        select = numbers.nextInt();

        switch (select) {
            case 1:
                System.out.print("Toplama sonucu: " + (num1+num2));
                break;
            case 2:
                System.out.print("Çıkarma sonucu: " + (num1-num2) );
                break;
            case 3:
                if(num2 == 0) {
                    System.out.println("Bir sayı sıfıra bölünemez");
                }else {
                    System.out.print("Bölme sonucu: " + (num1 / num2) );
                }
                break;
            case 4:
                System.out.print("Çarpma sonucu: " + (num1*num2) );
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }
    }
}
