package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//  Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
        Scanner scan = new Scanner (System.in);

        System.out.print("Eleman sayısını giriniz : ");
        int n = scan.nextInt();

        int n1=0,n2=1,n3;
        System.out.print(n1 +" "+n2+" ");
        for (int i =2; i <= n; i++) {
            n3=n2+n1;

            System.out.print(n3+" ");

            n1=n2;
            n2=n3;
        }
    }
}
