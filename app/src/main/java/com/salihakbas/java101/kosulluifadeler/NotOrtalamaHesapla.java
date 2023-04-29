package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class NotOrtalamaHesapla {

    public static void main(String[] args) {
        int matematik, fizik, kimya, türkçe, tarih, müzik;
        Scanner notlar = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = notlar.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = notlar.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = notlar.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        türkçe = notlar.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = notlar.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        müzik = notlar.nextInt();

        int toplam = matematik + fizik + kimya + türkçe + tarih + müzik ;
        double ortalama = toplam / 6.0 ;

        System.out.println("Ortalamanız : " + ortalama);
        System.out.println(ortalama >= 60 ? "Geçtiniz": "Kaldınız");


    }
}
