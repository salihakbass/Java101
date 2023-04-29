package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class SınıfGeçmeDurumu {
    public static void main(String[] args) {
        int matematik, türkce, fizik, kimya, müzik;

        Scanner notlar = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        matematik = notlar.nextInt();

        System.out.print("Türkçe notunuz: ");
        türkce = notlar.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = notlar.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = notlar.nextInt();

        System.out.print("Müzik notunuz: ");
        müzik = notlar.nextInt();

        double ortalama = (matematik + türkce + fizik + kimya + müzik) / 5.0 ;

            if(ortalama < 55) {
                System.out.println("Kaldınız, ortalamanız: " + ortalama);
            }else{
                System.out.println("Geçtiniz, ortalamanız: " + ortalama);
            }



    }
}
