package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r, nfakt = 1, rfakt = 1, n_rFark, n_rFarkFakt = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("n değerini giriniz: ");
        n = input.nextInt();
        System.out.println("r değerini giriniz: ");
        r = input.nextInt();

        n_rFark = n - r;

        for(int i = 1; i <= n; i++) {
            nfakt = nfakt * i;
        }
        for(int j = 1; j <= r; j++) {
            rfakt = rfakt * j;
        }
        for(int k = 1; k <= n_rFark; k++) {
            n_rFarkFakt = n_rFarkFakt * k;
        }
        int sonuc = nfakt /(rfakt * n_rFarkFakt);
        System.out.println(sonuc);


    }
}
