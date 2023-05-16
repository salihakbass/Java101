package com.salihakbas.java101.metotlar;

import java.util.Scanner;

public class HesapMakinesi {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number , result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();
            if(number == 0) {
                break;
            }
            result += number;
            System.out.println("Sonuç : " + result);
        }
    }

    static void minus() {
        int number, result = 0, count;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        count = scan.nextInt();
        for(int i = 1; i <= count; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            if(i == 1) {
                result += number;
                continue;
            }
            result -= number;
            System.out.println("Sonuç : " + result);
        }
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();

            if(number == 1) {
                break;
            }
            if(number == 0) {
                result = 0;
                break;
            }
            result *= number;

        }
        System.out.println("Sonuç : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for(int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();

            if(i != 1 && number == 0) {
                System.out.println("Bir sayıyı 0'a bölemezsiniz.");
                continue;
            }
            if(i == 1) {
                result = number;
                continue;
            }
            result /= number;

        }
        System.out.println("Sonuç : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int base = scan.nextInt();
        System.out.print("üs alınacak sayıyı giriniz: ");
        int exponent = scan.nextInt();
        int result = 1;

        for(int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        int number = scan.nextInt();
        int result = 1;
        for(int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int fNumber = scan.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sNumber = scan.nextInt();

        int result = fNumber % sNumber;

        System.out.println("Sonuç : " + result);
    }

    static void alanCevre() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa kenarı giriniz: ");
        int kKenar = scan.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int uKenar = scan.nextInt();

        int cevre = 2 * (kKenar + uKenar);
        int alan = kKenar * uKenar;

        System.out.println("Dikdörtgen Çevresi : " + cevre);
        System.out.println("Dikdörtgen Alanı : " + alan);
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select ;

        String menu = "1 - Toplama İşlemi\n"
                + "2 - Çıkarma İşlemi\n"
                + "3 - Çarpma İşlemi\n"
                + "4 - Bölme İşlemi\n"
                + "5 - Üslü Sayı Hesaplama\n"
                + "6 - Faktöriyel Hesaplama\n"
                + "7 - Mod Alma\n"
                + "8 - Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0 - Çıkış yap";

        do {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    alanCevre();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı bir değer girdiniz, tekrar deneyiniz.");
            }

        }while (select != 0);
    }
}
