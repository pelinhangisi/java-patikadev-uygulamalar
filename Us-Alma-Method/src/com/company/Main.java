package com.company;

import java.util.Scanner;

public class Main {

    // Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

    public static void main(String[] args) {
        static int power(int base, int exp) {
            int result = 1;

            for (int i = 1; i <= exp; i++) {
                result *= base;
            }
            System.out.println("Sonuç: " + result);
            return result;
        }


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int base, exp;

            while (true) {
                String menu = "1-Üs alma işlemi\n"
                        + "0-Çıkış işlemi\n";


                System.out.println("");
                System.out.print(menu);
                int select;
                select = input.nextInt();

                if (select == 0) {
                    System.out.print("Programdan çıkılıyor");
                    break;
                } else if (select == 1) {
                    System.out.print("Taban değeri giriniz: ");
                    base = input.nextInt();

                    System.out.print("Üs değeri giriniz: ");
                    exp = input.nextInt();
                    power(base,exp);
                } else {
                    System.out.print("Yanlış seçim yaptınız,tekrar deneyiniz!");
                    break;
                }
            }


        }
    }
    }

