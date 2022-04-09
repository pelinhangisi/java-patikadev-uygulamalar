package com.company;

import java.util.Scanner;

public class Main {
    /*
    Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve
    yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
    uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
     */

    public static void main(String[] args) {
        double yas, km, tip, indirimliTutar,  toplamTutar;

        Scanner scan = new Scanner(System.in);


        System.out.print("Gidilecek mesafeyi giriniz: ");
        km = scan.nextDouble();

        System.out.print("Yaşınızı giriniz : ");
        yas = scan.nextDouble();

        System.out.println("Yolculuk türünü seçiniz :\n1-Tek Yön\n2-Çift Yön");
        tip = scan.nextDouble();


        if (km < 0 || yas < 0 || (tip != 1 && tip != 2)) {
            System.out.println("Hatalı veri girdiniz");
        } else {
            toplamTutar = km * 0.10;
            if (yas < 12) {
                if (tip == 2) {
                    indirimliTutar = 2 * ((toplamTutar - (toplamTutar * 0.5)) * 0.8);
                    System.out.println(indirimliTutar);
                }else{
                    indirimliTutar=toplamTutar- toplamTutar*0.5;
                    System.out.println(indirimliTutar);
                }
            }
            else if(yas<24){
                if(tip==2){
                    indirimliTutar = 2*((toplamTutar - (toplamTutar*0.1))*0.8);
                    System.out.println(indirimliTutar);
                }
                else{
                    indirimliTutar=toplamTutar- toplamTutar*0.1;
                    System.out.println(indirimliTutar);
                }
            }
            else if(yas>65){
                if(tip==2){
                    indirimliTutar = 2*((toplamTutar - (toplamTutar*0.3))*0.8);
                    System.out.println(indirimliTutar);
                }
                else{
                    indirimliTutar=toplamTutar- toplamTutar*0.3;
                    System.out.println(indirimliTutar);
                }
            }
            else {
                if(tip==2){
                    indirimliTutar= 2*(toplamTutar*0.8);
                    System.out.println(indirimliTutar);
                }
                else{
                    indirimliTutar=toplamTutar;
                    System.out.println(indirimliTutar);
                }
            }
        }
    }
}
