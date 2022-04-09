package com.company;

import java.util.Scanner;

public class Main {
    /*
    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
    𝑢 = (a+b+c) / 2
    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
     */

    public static void main(String[] args) {
        int birinciKenar, ikinciKenar, ücüncüKenar;
        Scanner scan = new Scanner (System.in);

        System.out.println("1.kenarı giriniz : ");
        birinciKenar=scan.nextInt();
        System.out.println("2.kenarı giriniz : ");
        ikinciKenar=scan.nextInt();
        System.out.println("3.kenarı giriniz : ");
        ücüncüKenar=scan.nextInt();


        double u = (birinciKenar+ikinciKenar+ücüncüKenar) / 2;
        double alan = u * (u - birinciKenar) * (u - ikinciKenar) * (u - ücüncüKenar);

        double alanxalan = u * (u - birinciKenar) * (u - ikinciKenar) * (u - ücüncüKenar);

        alan = Math.sqrt(alanxalan);

        System.out.print("Üçgenin Alanı: " + alan);
    }
}
