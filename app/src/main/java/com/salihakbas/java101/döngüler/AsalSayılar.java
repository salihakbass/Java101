package com.salihakbas.java101.döngüler;

public class AsalSayılar {
    public static void main(String[] args) {

        for(int i = 2; i <= 100; i++) {
            boolean asal = true;
            for(int j = 2; j < i; j++ ) {
                if(i % j == 0) {
                    asal = false;
                }
            }
            if(asal){
                System.out.println(i);
            }
        }
    }
}
