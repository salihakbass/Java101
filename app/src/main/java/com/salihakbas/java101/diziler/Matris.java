package com.salihakbas.java101.diziler;

import java.util.Scanner;

public class Matris {
    public static void main(String[] args) {
        int matris[][] = new int[3][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + matris.length + " rows and "
                + matris[0].length + " columns: ");
        for (int row = 0; row < matris.length; row++) {
            for (int column = 0; column < matris[row].length; column++) {
                matris[row][column] = input.nextInt();
            }
        }
    }
}
