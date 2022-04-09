package com.company;

import java.util.Scanner;

public class Main {
    //  Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0, min = 0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "." + "sayıyı giriniz : ");
            int sayi = scan.nextInt();

            if (i == 1) {
                max = sayi;
                min = sayi;
            }
            if (sayi > max)
                max = sayi;

            if (sayi < min)
                min = sayi;
        }
        System.out.println("Girdiğiniz " + n + " sayı içinden en büyük olan sayı: " + max);
        System.out.println("Girdiğiniz " + n + " sayı içinden en küçük olan sayı: " + min);
    }
}
