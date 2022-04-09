package com.company;

import java.util.Scanner;

public class Main {
    // Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve
    // 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

    public static void main(String[] args) {
        int a, toplam = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Sayı Giriniz: ");
            a = input.nextInt();
            if(a % 4 == 0){
                toplam+=a;
            }
        }while (a % 2 == 0);
        System.out.println("Toplam " + toplam);
    }
}
