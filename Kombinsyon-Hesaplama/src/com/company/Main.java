package com.company;

import java.util.Scanner;

public class Main {

    /*
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
    Java ile kombinasyon hesaplayan program yazınız.
    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i, j, a, b, atoplam=1, btoplam=1, ctoplam=1;

        System.out.print("1. Sayıyı Giriniz: ");
        a = scan.nextInt();

        System.out.print("2. Sayıyı Giriniz");
        b = scan.nextInt();

        for (i=1; i<=a;i++){
            atoplam*=i;
        }
        System.out.println("1. Sayının Faktöriyeli: " + atoplam);

        for (j=1; j<=b;j++){
            btoplam*=j;
        }
        System.out.println("2. Sayının Faktöriyeli: " + btoplam);

        int c = a-b;
        for (i=1; i<=a;i++){
            ctoplam*=i;
        }
        System.out.println("a-b nin faktöriyeli: " + ctoplam);
        System.out.println("Kombinasyon: " + (atoplam) / (btoplam*(ctoplam)));
    }
}
