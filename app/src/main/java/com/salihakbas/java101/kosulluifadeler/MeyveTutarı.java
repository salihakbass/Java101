package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class MeyveTutarı {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlıcan = 5.00;

        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlıcanKilo;

        Scanner kilo = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız: ");
        armutKilo = kilo.nextDouble();
        System.out.print("Kaç kilo elma aldınız: ");
        elmaKilo = kilo.nextDouble();
        System.out.print("Kaç kilo domates aldınız: ");
        domatesKilo = kilo.nextDouble();
        System.out.print("Kaç kilo muz aldınız: ");
        muzKilo = kilo.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız: ");
        patlıcanKilo = kilo.nextDouble();

        double toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlıcan * patlıcanKilo);
        System.out.println("Toplam alışveriş tutarınız: " + toplam);
    }
}
