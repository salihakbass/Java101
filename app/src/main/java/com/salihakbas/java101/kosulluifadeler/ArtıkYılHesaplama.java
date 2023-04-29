package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        int yıl;

        Scanner input = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yıl = input.nextInt();

        if(yıl % 4 == 0 || yıl % 400 == 0) {
            System.out.println(yıl + " " + "bir artık yıldır");
        }else{
            System.out.println(yıl + " " + "bir artık yıl değildir");
        }
    }

}
