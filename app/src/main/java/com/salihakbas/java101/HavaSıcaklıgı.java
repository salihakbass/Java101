package com.salihakbas.java101;

import java.util.Scanner;

public class HavaSıcaklıgı {
    public static void main(String[] args) {
        int sıcaklık;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        sıcaklık = input.nextInt();

        if(sıcaklık <= 5) {
            System.out.println("Bu havada kayağa gidilir");
        }else if (sıcaklık < 15) {
            System.out.println("Bu havada sinemaya gidilir");
        }else if(sıcaklık < 25) {
            System.out.println("Bu havada pikniğe gidilir");
        }else{
            System.out.println("Bu havada yüzmeye gidilir");
        }
    }
}
