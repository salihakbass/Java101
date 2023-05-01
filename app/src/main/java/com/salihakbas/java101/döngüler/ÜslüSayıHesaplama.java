package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class ÜslüSayıHesaplama {
    public static void main(String[] args) {
        int n,k,toplam = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        k = input.nextInt();

        for(int i = 1; i <= k; i++) {
            toplam *= n;
        }
        System.out.println(n + "^" + k + "=" + toplam);
    }
}
