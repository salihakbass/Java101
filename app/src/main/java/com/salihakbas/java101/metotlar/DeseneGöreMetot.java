package com.salihakbas.java101.metotlar;

import java.util.Scanner;

public class DeseneGöreMetot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = scan.nextInt();
        int temp = n;
        minus(n,temp);

    }
    public static void minus(int n,int temp) {
        if(n > 0) {
            System.out.println(n + " ");
            minus(n - 5,temp);
        }else {
            plus(n,temp);
        }
    }
    public static void plus(int n, int temp) {
       if(temp >= n) {
           System.out.println(n + " ");
           plus(n + 5,temp);
       }
    }
}
