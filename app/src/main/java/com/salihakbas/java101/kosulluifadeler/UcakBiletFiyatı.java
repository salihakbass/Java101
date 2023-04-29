package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class UcakBiletFiyatı {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi ;
        double normalTutar, yasİndirimOranı, indirimliTutar, tipİndirimi,toplamTutar ;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden yazınız: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.println("Yolculuk tipini seçiniz: \n1-Tek yön\n2-Gidiş-Dönüş");
        yolculukTipi = input.nextInt();


        if(mesafe >= 0  && yas > 0) {
            switch (yolculukTipi) {
                case 1:
                    if(yas < 12) {
                        normalTutar = mesafe * 0.1;
                        yasİndirimOranı = normalTutar * 0.5;
                        indirimliTutar = normalTutar - yasİndirimOranı;
                        System.out.println("Toplam tutarınız: " + indirimliTutar + " " + "TL");
                    }else if(yas <= 24) {
                        normalTutar = mesafe * 0.1;
                        yasİndirimOranı = normalTutar * 0.1;
                        indirimliTutar = normalTutar - yasİndirimOranı;
                        System.out.println("Toplam tutarınız: " + indirimliTutar+ " " + "TL");
                    }else if(yas <= 65) {
                        normalTutar = mesafe * 0.1;
                        System.out.println("Toplam tutarınız: " + normalTutar);
                    }else{
                        normalTutar = mesafe * 0.1;
                        yasİndirimOranı = normalTutar * 0.3;
                        indirimliTutar = normalTutar - yasİndirimOranı;
                        System.out.println("Toplam tutarınız: " + indirimliTutar + " " + "TL");
                    }
                    break;

                case 2:
                    if(yas < 12) {
                        normalTutar = mesafe * 0.1;
                        yasİndirimOranı = normalTutar * 0.5;
                        indirimliTutar = normalTutar - yasİndirimOranı;
                        tipİndirimi = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - tipİndirimi) * 2 ;
                        System.out.println("Toplam tutarınız: " + toplamTutar + " " + "TL");
                    }else if(yas <= 24) {
                        normalTutar = mesafe * 0.1;
                        yasİndirimOranı = normalTutar * 0.1;
                        indirimliTutar = normalTutar - yasİndirimOranı;
                        tipİndirimi = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - tipİndirimi) * 2 ;
                        System.out.println("Toplam tutarınız: " + toplamTutar + " " + "TL");
                    }else if(yas <= 65) {
                        normalTutar = mesafe * 0.1;
                        tipİndirimi = normalTutar * 0.2;
                        toplamTutar = (normalTutar-tipİndirimi) * 2;
                        System.out.println("Toplam tutarınız: " + toplamTutar + " " +"TL");
                    }else{
                        normalTutar = mesafe * 0.1;
                        yasİndirimOranı = normalTutar * 0.5;
                        indirimliTutar = normalTutar - yasİndirimOranı;
                        tipİndirimi = indirimliTutar * 0.2;
                        toplamTutar = (indirimliTutar - tipİndirimi) * 2 ;
                        System.out.println("Toplam tutarınız: " + toplamTutar + " " + "TL");
                    }
                    break;
                default:
                    System.out.println("Hatalı veri girdiniz");

            }
        }else {
            System.out.println("Hatalı veri girdiniz");
        }
    }
}
