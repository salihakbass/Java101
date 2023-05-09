package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class TersÜcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz: ");
        int n = input.nextInt();

        for(int i = n; i >= 0; i-- ) {
            for(int j = (n-i); j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 2 * i -1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
