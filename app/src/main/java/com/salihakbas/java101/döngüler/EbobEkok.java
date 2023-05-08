package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, ebob = 1, i = 1;;
        System.out.print("n1 sayısını giriniz: ");
        n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz: ");
        n2 = input.nextInt();

        //EBOB
        while(i <= n1) {
            if(n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);
        //EKOK
        int ekok = (n1*n2) / ebob;
        System.out.println("EKOK: " + ekok);
    }


}
