package com.salihakbas.java101;

import java.util.Scanner;

public class KücüktenBüyüge {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sayılar = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        a = sayılar.nextInt();

        System.out.print("2.sayıyı giriniz: ");
        b = sayılar.nextInt();

        System.out.print("3.sayıyı giriniz: ");
        c = sayılar.nextInt();

        if(a < b && a < c){
            if(b < c) {
                System.out.println(a + "<" + b + "<" + c);
            }else{ // c < b
                System.out.println(a + "<" + c + "<" + b);
            }
        }else if(b < a && b < c) {
            if(a < c) {
                System.out.println(b + "<" + a + "<" + c);
            }else{ // c < a
                System.out.println(b + "<" + c + "<" + a);
            }
        }
        else{
            if(a < b) {
                System.out.println(c + "<" + a + "<" + b);
            }else{ // b < a
                System.out.println(c + "<" + b + "<" + a);
            }

        }

    }


}
