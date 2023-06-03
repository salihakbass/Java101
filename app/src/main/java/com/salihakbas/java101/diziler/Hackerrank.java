package com.salihakbas.java101.diziler;

import java.util.Scanner;

public class Hackerrank {
    public static void main(String[] args) {
        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("n: ");
        int n = input.nextInt();


        for(int i = 0; i < n; i++)  {
            result *= 2;
            System.out.println(result);
        }
    }

}
