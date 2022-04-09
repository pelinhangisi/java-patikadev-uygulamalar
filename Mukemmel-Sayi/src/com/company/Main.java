package com.company;

import java.util.Scanner;

public class Main {
    /*
    Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.”
    ifadelerini ekrana yazan programı Java dilinde yazınız.
    Mükemmel Sayı Nedir ?
    Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
     */

    public static void main(String[] args) {
        int number, i, total=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number=scan.nextInt();

        for (i=1; i<number; i++){
            if (number%i==0){
                total += i;
            }
        }
        if (total==number){
            System.out.println(number + " Mükemmel Sayıdır.");
        } else {
            System.out.println(number + " Mükemmel Sayı Değildir.");
        }
    }
}
