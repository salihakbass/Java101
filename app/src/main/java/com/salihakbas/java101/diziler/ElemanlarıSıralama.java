package com.salihakbas.java101.diziler;

import java.util.Arrays;
import java.util.Scanner;

public class ElemanlarıSıralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.print("Dizinin elemanlarını giriniz: ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print((i+1) + ". elemanı giriniz: ");
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
