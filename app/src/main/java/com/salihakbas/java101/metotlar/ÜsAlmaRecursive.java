package com.salihakbas.java101.metotlar;

import java.util.Scanner;

public class ÜsAlmaRecursive {

    static int power(int base, int exponent) {
        if(exponent == 0) {
            return 1;
        }else if(exponent == 1) {
            return base;
        }else{
            return base * power(base,exponent -1);
        }

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri girin: ");
        int taban = scan.nextInt();
        System.out.print("Üs değeri girin: ");
        int us = scan.nextInt();
        System.out.println(power(taban, us));
    }
}
