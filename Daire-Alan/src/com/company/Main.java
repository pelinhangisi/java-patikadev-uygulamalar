package com.company;

import java.util.Scanner;

public class Main {
    /* Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
    𝜋 sayısını = 3.14 alınız
    Formül : (𝜋 * (r*r) * 𝛼) / 360 */

    public static void main(String[] args) {
        int r, a;
        double pi=3.14, alan;

        Scanner scan = new Scanner (System.in);

        System.out.print("Lütfen dairenin yarıçapını giriniz :");
        r = scan.nextInt();

        System.out.print("Lütfen merkez açısının ölçüsünü giriniz");
        a = scan.nextInt();

        alan = (pi * (r*r) * a) / 360;

        System.out.println(alan);
    }
}
