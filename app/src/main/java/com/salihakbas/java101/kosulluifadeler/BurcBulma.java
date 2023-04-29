package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int ay, gün ;
        String burc = "";


        Scanner input = new Scanner(System.in) ;

        System.out.print("Doğduğunuz ayı (1-12) giriniz: ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        gün = input.nextInt();

        if(ay <= 12 ) {
            // Ocak ayı
            if(ay == 1) {
                if(gün <= 31) {
                    if(gün < 22) {
                        burc = "Oğlak" ;
                    }else{
                        burc = "Kova" ;
                    }
                }else{
                    System.out.println("Ocak ayı 31 gündür");
                }
                // Şubat Ayı
            }else if(ay == 2) {
                if(gün <= 28 ) {
                    if(gün <= 19) {
                        burc = "Kova" ;
                    }else{
                        burc = "Balık" ;
                    }
                }else{
                    System.out.println("Şubat ayı 28 gündür");
                }
                //Mart Ayı
            }else if(ay == 3) {
                if(gün <= 31) {
                    if(gün < 21) {
                        burc = "Balık" ;
                    }else{
                        burc = "Koç" ;
                    }
                }else{
                    System.out.println("Mart ayı 31 gündür");
                }
                //Nisan Ayı
            }else if(ay == 4) {
                if(gün <= 30) {
                    if(gün < 21) {
                        burc = "Koç" ;
                    }else{
                        burc = "Boğa" ;
                    }
                }else{
                    System.out.println("Nisan ayı 30 gündür");
                }
                //Mayıs ayı
            }else if(ay == 5) {
                if(gün <= 31) {
                    if(gün < 22) {
                        burc = "Boğa" ;
                    }else{
                        burc = "İkizler" ;
                    }
                }else{
                    System.out.println("Mayıs ayı 31 gündür");
                }
                //Haziran ayı
            }else if(ay == 6) {
                if(gün <= 30) {
                    if(gün < 23) {
                        burc = "İkizler" ;
                    }else{
                        burc = "Yengeç" ;
                    }
                }else{
                    System.out.println("Haziran ayı 30 gündür");
                }
                //Temmuz ayı
            }else if(ay == 7) {
                if(gün <= 31) {
                    if(gün < 23) {
                        burc = "Yengeç" ;
                    }else{
                        burc = "Aslan" ;
                    }
                }else{
                    System.out.println("Temmuz ayı 31 gündür");
                }
                //Ağustos ayı
            }else if(ay == 8) {
                if(gün <= 31) {
                    if(gün < 23) {
                        burc = "Aslan" ;
                    }else{
                        burc = "Başak" ;
                    }
                }else{
                    System.out.println("Ağustos ayı 31 gündür");
                }
            }
                //Eylül ayı
            else if(ay == 9) {
                if(gün <= 30) {
                    if(gün < 23) {
                        burc = "Başak" ;
                    }else{
                        burc = "Terazi" ;
                    }
                }else{
                    System.out.println("Eylül ayı 30 gündür");
                }
                //Ekim ayı
            }else if(ay == 10) {
                if(gün <= 31) {
                    if(gün < 23) {
                        burc = "Terazi" ;
                    }else{
                        burc = "Akrep" ;
                    }
                }else{
                    System.out.println("Ekim ayı 31 gündür");
                }
                //Kasım ayı
            }else if(ay == 11) {
                if(gün <= 30) {
                    if(gün < 22) {
                        burc = "Akrep" ;
                    }else{
                        burc = "Yay" ;
                    }
                }else{
                    System.out.println("Kasım ayı 30 gündür");
                }
                //Aralık ayı
            }else if(ay == 12) {
                if(gün <= 31) {
                    if(gün < 22) {
                        burc = "Yay" ;
                    }else{
                        burc = "Oğlak" ;
                    }
                }else{
                    System.out.println("Aralık ayı 31 gündür");
                }
            }
        }else{
            System.out.println("Doğdunuz ay için 12'den fazla değer giremezsiniz");
        }
        System.out.println("Burcunuz: " + burc);
    }

}


/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
Ödev
Aynı örneği switch-case kullanmadan yapınız.
 */
