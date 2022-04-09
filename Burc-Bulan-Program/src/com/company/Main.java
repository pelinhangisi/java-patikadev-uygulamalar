package com.company;

import java.util.Scanner;

public class Main {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */

    public static void main(String[] args) {
        int month, day;

        Scanner scan = new Scanner (System.in);

        System.out.print("Doğduğunuz ay :");
        month= scan.nextInt();

        System.out.print("Doğduğunuz gün : ");
        day=scan.nextInt();

        if (day>=1 && day<=31){
            if (month==1){
                if (day<=21){
                    System.out.println("Oğlak burcu");
                } else
                    System.out.println("Kova burcu");
            }
            if (month==2){
                if (day<=19){
                    System.out.println("Kova burcu");
                } else
                    System.out.println("Balık burcu");
            }
            if (month==3){
                if (day<=20){
                    System.out.println("Balık burcu");
                } else
                    System.out.println("Koç burcu");
            }
            if (month==4){
                if (day<=20){
                    System.out.println("Koç burcu");
                } else
                    System.out.println("Boğa burcu");
            }
            if (month==5){
                if (day<=21){
                    System.out.println("Boğa burcu");
                } else
                    System.out.println("İkizler burcu");
            }
            if (month==6){
                if (day<=22){
                    System.out.println("İkizler burcu");
                } else
                    System.out.println("Yengeç burcu");
            }
            if (month==7){
                if (day<=22){
                    System.out.println("Yengeç burcu");
                } else
                    System.out.println("Aslan burcu");
            }
            if (month==8){
                if (day<=22){
                    System.out.println("Aslan burcu");
                } else
                    System.out.println("Başak burcu");
            }
            if (month==9){
                if (day<=22){
                    System.out.println("Başak burcu");
                } else
                    System.out.println("Terazi burcu");
            }
            if (month==10){
                if (day<=22){
                    System.out.println("Terazi burcu");
                } else
                    System.out.println("Akrep burcu");
            }
            if (month==11){
                if (day<=21){
                    System.out.println("Akrep burcu");
                } else
                    System.out.println("YAY burcu");
            }
            if (month==12){
                if (day<=21){
                    System.out.println("YAY burcu");
                } else
                    System.out.println("Oğlak burcu");
            }
        }else {
            System.out.println("Geçersiz gün girdiniz");
        }
    }
}
