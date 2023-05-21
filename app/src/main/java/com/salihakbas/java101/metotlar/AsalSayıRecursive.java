package com.salihakbas.java101.metotlar;

import java.util.Scanner;

public class AsalSayıRecursive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int k = scan.nextInt();

        if(asal(k,2)) {
            System.out.println(k + " sayısı ASALDIR !");
        }else{
            System.out.println(k + " sayısı ASAL değildir !");
        }

    }
    public static boolean asal(int k,int n) {
        if(k < 2) {
            return false;
        }
        if(k == 2) {
            return true;
        }
        if(k % n == 0) {
            return false;
        }
        if(k % n != 0) {
            return true;
        }

        return asal(k,n+1);
    }
}
