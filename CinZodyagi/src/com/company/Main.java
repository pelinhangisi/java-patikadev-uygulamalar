package com.company;

import java.util.Scanner;

public class Main {

    /*
    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
    Doğum Tarihi %12 = 0 ➜ Maymun
    Doğum Tarihi %12 = 1 ➜ Horoz
    Doğum Tarihi %12 = 2 ➜ Köpek
    Doğum Tarihi %12 = 3 ➜ Domuz
    Doğum Tarihi %12 = 4 ➜ Fare
    Doğum Tarihi %12 = 5 ➜ Öküz
    Doğum Tarihi %12 = 6 ➜ Kaplan
    Doğum Tarihi %12 = 7 ➜ Tavşan
    Doğum Tarihi %12 = 8 ➜ Ejderha
    Doğum Tarihi %12 = 9 ➜ Yılan
    Doğum Tarihi %12 = 10 ➜ At
    Doğum Tarihi %12 = 11 ➜ Koyun
    */

    public static void main(String[] args) {
        int dogumYili;
        String burc;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Doğum Tarihinizi Giriniz :");
        dogumYili = scan.nextInt();

        if (dogumYili % 12 == 0){
            burc= "Maymun";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 1){
            burc="Horoz";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 2){
            burc="Köpek";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 3){
            burc="Domuz";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 4){
            burc="Fare";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 5 ){
            burc="Öküz";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 6){
            burc="Kaplan";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 7){
            burc="Tavşan";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 8){
            burc="Ejderha";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 9){
            burc="Yılan";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 10){
            burc="At";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else if (dogumYili % 12 == 11){
            burc="Koyun";
            System.out.println("Çin Zodyağı Burcunuz : " + burc);
        } else {
            System.out.println("Hata");
        }

    }
}
