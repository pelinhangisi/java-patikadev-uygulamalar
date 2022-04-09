package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.
        Scanner scan = new Scanner(System.in);
        int sayi;

        System.out.print("n sayısını giriniz : ");
        sayi=scan.nextInt();


        double sonuc=0;
        for(double i=1; i<=sayi; i++){
            sonuc += (1.0/i);
        }

        System.out.println(sonuc);
    }
}
