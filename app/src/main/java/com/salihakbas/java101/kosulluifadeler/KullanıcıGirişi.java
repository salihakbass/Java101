package com.salihakbas.java101.kosulluifadeler;

import java.util.Scanner;

public class KullanıcıGirişi {
    public static void main(String[] args) {
        String username, password, newPassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz: ");
        username = input.nextLine();
        System.out.print("Lütfen şifrenizi giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş başarılı");
        } else {
            System.out.println("Giriş başarısız");
            System.out.println("Yeni şifre oluşturmak için - 1\nTekrar denemek için - 2");
            select = input.nextInt();

            switch (select) {
                case 1:
                System.out.print("Lütfen yeni şifreyi giriniz: ");
                newPassword = input.next();
                if(newPassword.equals("java123")) {
                    System.out.println("Şifreniz eski şifreniz ile aynı olamaz");
                }else {
                    System.out.println("Yeni şifre oluşturuldu");
                }
                break;
                case 2:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hatalı giriş");
            }




        }

    }

}
