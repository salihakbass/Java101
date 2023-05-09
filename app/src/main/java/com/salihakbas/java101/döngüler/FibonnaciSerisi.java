package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class FibonnaciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3;

        System.out.print("Basamak değerini giriniz: ");
        int basamak = input.nextInt();

        System.out.println(n1 + n2);

        for(int i = 2; i <= basamak ; i ++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
