package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Bir sayının basamak sayılarının toplamını hesaplayan program yazınız Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        int sayi;
        Scanner scan =new Scanner(System.in);


        System.out.print("Sayı girin: ");
        sayi=scan.nextInt();

        int sayac=0,sonuc=0,basDeger,a=sayi;

        while(a!=0){
            a /=10;
            sayac+=1;
        }

        a=sayi;

        for(int i=0;i<sayac;i++){
            basDeger=a%10;
            sonuc+=basDeger;
            a /=10;

        }
        System.out.println(sayi+"'nın basamakları toplamı: "+sonuc);
    }
}
