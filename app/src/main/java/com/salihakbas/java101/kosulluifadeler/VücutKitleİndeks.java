package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class VücutKitleİndeks {
    public static void main(String[] args) {
        double boy, kilo;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz: ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = input.nextDouble();

        double vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);
    }
}
