package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class HipotenüsBulma {
    public static void main(String[] args) {
        int a, b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("A kenarını giriniz: ");
        a = girdi.nextInt();
        System.out.print("B kenarını giriniz: ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));


        System.out.println("Hipotenüs: " + c);

    }
}
