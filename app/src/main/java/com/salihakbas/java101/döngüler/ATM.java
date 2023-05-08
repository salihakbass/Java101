package com.salihakbas.java101.döngüler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int select;
        int balance = 1500;

        Scanner input = new Scanner(System.in);


        while(right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Parolanızı giriniz: ");
            password = input.nextLine();

            if(userName.equals("salihakbas") && password.equals("123321")) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz");
                do {
                    System.out.println(
                            "1 - Para Yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yap");

                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("Yatırmak istediğiniz para miktarını giriniz: ");
                            int yPrice = input.nextInt();
                            balance += yPrice;
                            System.out.println("Yeni bakiyeniz : " + balance + "TL");
                            break;

                        case 2:
                            System.out.println("Çekmek istediğiniz para miktarını giriniz: ");
                            int cPrice = input.nextInt();
                            if(cPrice > balance) {
                                System.out.println("Bakiye yetersiz");
                            }else {
                                balance -= cPrice;
                            }
                            System.out.println("Yeni bakiyeniz : " + balance + "TL");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance + "TL");
                            break;
                    }
                }while (select != 4);
                System.out.println("Çıkış yapıldı, iyi günler");
                break;
            }else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya parola");
                if(right == 0) {
                    System.out.println("Hesabınız bloke olmuştur, lütfen bankanız ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
