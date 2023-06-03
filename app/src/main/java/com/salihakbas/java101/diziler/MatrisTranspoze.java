package com.salihakbas.java101.diziler;

public class MatrisTranspoze {
    public static void main(String[] args) {
        int[][] matris = {{1,2,3},
                        {4,5,6}};
        System.out.println("Before the change");
        print(matris);
        System.out.println("After the change");
        transpoze(matris);
        

    }
    static void transpoze(int[][] matris) {
        int[][] newMatris = new int[matris[0].length][matris.length];
        for(int row = 0; row < matris.length; row++) {
            for(int col = 0; col < matris[0].length; col++ ) {
                newMatris[col][row] = matris[row][col];
            }
        }
        print(newMatris);
    }
    static void print(int[][] arr) {
        for(int[] row : arr) {
            for(int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
