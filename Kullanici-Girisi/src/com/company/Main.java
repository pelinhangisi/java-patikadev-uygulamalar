package com.company;

import java.util.Scanner;

public class Main {
    /*
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve
    unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa
    "Şifre oluşturuldu" yazan programı yazınız.
     */

    public static void main(String[] args) {
        String userName, password, select, newPassword;

        Scanner input = new Scanner (System.in);

        System.out.println("Kullanıcı Adı : ");
        userName=input.nextLine();

        System.out.println("Şifre : ");
        password=input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Sisteme Giriş Yaptınız");
        }
        else {
            System.out.println("Kullanıcı Adınız veya Şifreniz Hatalı,Şifrenizi Sıfırlamak istermisiniz :1-Evet\n2-Hayır");
        }
        select=input.nextLine();
        if (select.equals("1")){
            System.out.println("Yeni Şifrenizi Giriniz : ");

            newPassword=input.nextLine();
            if (newPassword.equals("java123")){
                System.out.println("Şifre oluşturulamadı lütfen başka şifre giriniz : ");
            }
            else{
                System.out.println("Yeni Şifre Başarıyla Oluşturuldu");
            }
        }
    }
}
