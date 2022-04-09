package com.company;

import java.util.Scanner;

public class Main {
    /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */

    public static void main(String[] args) {
        double tutar, kdvOrani, kdvliTutar;
        Scanner deger = new Scanner (System.in);

        System.out.println("Lütfen bir tutar giriniz : ");
        tutar=deger.nextDouble();
        boolean kdv = tutar > 1000;
        kdvOrani = kdv ? 0.08 : 0.18;

        kdvliTutar= tutar * kdvOrani;

        System.out.println("KDV'siz tutar : "+ tutar );
        System.out.println("KDV'li tutar : " + (tutar + kdvliTutar));
        System.out.println("KDV tutarı : " + kdvliTutar);
    }
}
