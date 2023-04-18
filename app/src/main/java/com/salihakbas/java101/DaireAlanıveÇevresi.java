package com.salihakbas.java101;

import java.util.Scanner;

public class DaireAlanıveÇevresi {
    public static void main(String[] args) {
       int r, a;
       double pi = 3.14;

        Scanner yarıcap = new Scanner(System.in);
        System.out.print("Yarıçapı giriniz: ");
        r = yarıcap.nextInt();
        Scanner maö = new Scanner(System.in);
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        a = maö.nextInt();

        double daireDilimAlanı = (pi * (r*r) * a) / 360 ;
        System.out.println("Daire dilim alanı: " + daireDilimAlanı);


        /*
        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        System.out.println("Alan : " + alan);
        System.out.println("Çevre : " + cevre);
        */
    }
}
