package com.salihakbas.java101.isPalindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String str = input.next();

        System.out.println(isPalindrome2(str));
        System.out.println(isPalindrome(str));
    }


    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1 ;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    static boolean isPalindrome2(String str) {
        String reverse = "";
        for(int i = str.length() -1 ; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        if(str.equals(reverse))
            return true;
        else
            return false;
    }
}
