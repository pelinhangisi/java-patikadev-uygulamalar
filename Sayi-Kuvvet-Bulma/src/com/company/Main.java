package com.company;

import java.util.Scanner;

public class Main {
    // Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

    public static void main(String[] args) {
        int i, n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Sayı giriniz:");
        n=scan.nextInt();

        for (i=1; i<=n; i*=4){
            System.out.println("4'ün katları olan sayılar : "+ i);
        }

        for (i=1; i<=n; i*=5){
            System.out.println("5'in katları olan sayılar : " +i);
        }
    }
}
