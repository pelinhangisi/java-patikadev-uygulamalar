package com.company;

import java.util.Scanner;

public class Main {
    /* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
    Geçme Notu : 55
    Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/

    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, total=0, counter=0;


        Scanner input= new Scanner (System.in);

        System.out.print("Matematik notunuzu giriniz :");
        mat=input.nextInt();
        if (mat >= 0 && mat <= 100) {
            total += mat;
            counter++;
        }

        System.out.print("Fizik notunuzu giriniz :");
        fizik=input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            counter++;
        }

        System.out.print("Türkçe notunuzu giriniz :");
        turkce=input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            counter++;
        }

        System.out.print("Kimya notunuzu giriniz :");
        kimya=input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            counter++;
        }

        System.out.print("Müzik notunuzu giriniz :");
        muzik=input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            counter++;
        }

        double ortalama = total / counter;

        if (ortalama<=55){
            System.out.println("Sınıfta kaldınız, seneye görüşmek üzere");
        }
        else {
            System.out.println("Tebrikler, sınıfı geçtiniz ");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}
