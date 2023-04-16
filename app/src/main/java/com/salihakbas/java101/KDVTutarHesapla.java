package com.salihakbas.java101;

import java.util.Scanner;

public class KDVTutarHesapla {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.print("Alışveriş tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = kdvTutar + tutar;

        System.out.println("Kdv Oranı: " + kdvOran);
        System.out.println("Kdv Tutarı: " + kdvTutar);
        System.out.println("Kdv'li Tutar: " + kdvliTutar);



    }
}
