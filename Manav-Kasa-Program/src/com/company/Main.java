package com.company;

import java.util.Scanner;

public class Main {
    /*
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
    Meyveler ve KG Fiyatları
    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
    Örnek Çıktı;
    Armut Kaç Kilo ? :0
    Elma Kaç Kilo ? :1
    Domates Kaç Kilo ? :1
    Muz Kaç Kilo ? :2
    Patlıcan Kaç Kilo ? :3
    Toplam Tutar : 21.68 TL
     */

    public static void main(String[] args) {
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat=0.95, patlicanFiyat=5, toplamTutar;
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        Scanner input = new Scanner (System.in) ;

        System.out.print("Armut kaç kilo ? :");
        armutKg= input.nextInt();
        System.out.print("Elma kaç kilo ? :");
        elmaKg = input.nextInt();
        System.out.print("Domates kaç kilo ? :");
        domatesKg = input.nextInt();
        System.out.print("Muz kaç kilo ? :");
        muzKg = input.nextInt();
        System.out.print("Patlıcan kaç kilo ? :");
        patlicanKg = input.nextInt();

        toplamTutar= (armutKg*armutFiyat)+ (elmaKg*elmaFiyat) + (domatesKg*domatesFiyat)+ (muzKg*muzFiyat)+ (patlicanKg*patlicanFiyat);

        System.out.println(toplamTutar + "TL");

    }
}
