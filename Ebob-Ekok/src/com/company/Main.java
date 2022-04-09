package com.company;

import java.util.Scanner;

public class Main {

    //Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.

    public static void main(String[] args) {
        int n1,n2;
        Scanner scan =new Scanner(System.in);

        System.out.print("n1 sayısını giriniz : ");
        n1=scan.nextInt();

        System.out.print("n2 sayısını giriniz ");
        n2=scan.nextInt();

        int i = 0, j=0, a1=0, a2=0;
        int ebob=0;
        int ekok=0;


        while ( i <= n1){
            i++;
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
        }
        System.out.println(ebob);

        System.out.print("a1 sayısını giriniz : ");
        a1=scan.nextInt();

        System.out.print("a2 sayısını giriniz ");
        a2=scan.nextInt();

        while (j<= (a1*a2)){
            j++;
            if( j%a1==0 && j%a2==0){
                System.out.println(j);
                break;
            }
        }
    }
}
