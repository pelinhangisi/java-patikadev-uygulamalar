package com.company;

import java.util.Scanner;

public class Main {
    /*
    Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan
    programı yazın.
    Ödev
    Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
    Not : If ve Else kullanılmayacak...
     */

    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalamaNot;



        Scanner dersler = new Scanner (System.in);

        System.out.print("Matematik dersi notunuzu giriniz : ");
        mat = dersler.nextInt();

        System.out.print("Fizik dersi notunuzu giriniz : ");
        fizik = dersler.nextInt();

        System.out.print("Kimya dersi notunuzu giriniz : ");
        kimya = dersler.nextInt();

        System.out.print("Türkçe dersi notunuzu giriniz : ");
        turkce = dersler.nextInt();

        System.out.print("Tarih dersi notunuzu giriniz : ");
        tarih = dersler.nextInt();



        System.out.print("Müzik dersinotunuzu giriniz : ");
        muzik = dersler.nextInt();

        ortalamaNot = (mat+fizik+kimya+turkce+tarih+muzik) / 6;


        System.out.println("Dönem sonu ortalama notunuz : " + ortalamaNot);

        boolean sonuc=(ortalamaNot>60);
        sonuc=true;

        System.out.println(sonuc ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız");

    }
}
