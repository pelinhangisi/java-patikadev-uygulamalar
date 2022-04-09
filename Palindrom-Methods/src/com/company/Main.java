package com.company;

import java.util.Scanner;

public class Main {
    /*
    Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
    Palindrom Sayı Nedir ?
    Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    public static boolean isPalindrom(int number){
        int temp=number, reversNumber=0, lastNumber;

        while (temp != 0){
            lastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kontrol edilecek sayıyı giriniz : ");
        int num = scan.nextInt();
        System.out.println(isPalindrom(num));

    }
}
