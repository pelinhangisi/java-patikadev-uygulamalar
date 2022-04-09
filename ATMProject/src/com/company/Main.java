package com.company;

import java.util.Scanner;

public class Main {

    // Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız :
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int option;
        boolean session = true;
        while(right>0){
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();

            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");


                while (session) {

                    System.out.println("1- Para Çekme");
                    System.out.println("2- Para Yatırma");
                    System.out.println("3- Bakiye Sorgula");
                    System.out.println("4- Çıkış");
                    System.out.print("İşlem Seçiniz: ");
                    option = input.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Para Miktarı: ");
                            int amount = input.nextInt();
                            if (amount > balance) {
                                System.out.println("Bakiye Yetersiz");
                            } else {
                                balance -= amount;
                                System.out.println("Para Miktarı: " + balance);
                            }
                            break;
                        case 2:
                            System.out.println("Para Miktarı: ");
                            int amount2 = input.nextInt();
                            balance += amount2;
                            System.out.println("Toplam Birikim: " + balance);
                            break;
                        case 3:
                            System.out.println("Toplam Birikim: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış");
                            session = false;

                            break;
                        default:
                            System.out.println("Tekrar Deneyiniz");
                            session = false;
                            right=-1;
                            break;
                    }
                }
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}
