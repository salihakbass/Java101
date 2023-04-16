package com.salihakbas.java101;

import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        int km, minimumTutar = 20, açılısTutarı = 10;
        double toplamTutar, kmBasıTutar = 2.20;

        Scanner mesafe = new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        km = mesafe.nextInt();

        toplamTutar = km * kmBasıTutar;
        toplamTutar += açılısTutarı;
        System.out.println(toplamTutar <= 20 ? "Tutarınız: " + minimumTutar + "TL" : "Tutarınız: " + toplamTutar + "TL");




    }
}
