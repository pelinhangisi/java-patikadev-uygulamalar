package com.company;


    public class Student {

        Course tarih;
        Course fizik;
        Course biyoloji;
        String name;
        String stuNo;
        int classes;
        double avarage;
        boolean isPass;

        Student(String name, String stuNo, String classes, Course tarih, Course fizik, Course biyoloji){
            this.name = name;
            this.stuNo = stuNo;
            this.tarih = tarih;
            this.fizik = fizik;
            this.biyoloji = biyoloji;
            this.isPass = false;
            this.avarage = 0.0;


        }

        void addBulkExamNote (int tarih, int fizik, int biyoloji){
            if (tarih>=0 && tarih<=100){
                this.tarih.note = tarih;
            }
            if (fizik>=0 && fizik<=100){
                this.fizik.note = fizik;
            }
            if (biyoloji>=0 && biyoloji<=100){
                this.biyoloji.note = biyoloji;
            }
        }

        void addSozluExamNote (int tarih, int fizik, int biyoloji){
            if (tarih>=0 && tarih<=100){
                this.tarih.sozluNote = tarih;
            }
            if (fizik>=0 && fizik<=100){
                this.fizik.sozluNote = fizik;
            }
            if (biyoloji>=0 && biyoloji<=100){
                this.biyoloji.sozluNote = biyoloji;
            }

        }

        void isPass (){

            this.avarage = (this.tarih.note*0.8 +this.tarih.sozluNote*0.2 + this.fizik.note*0.8+ this.fizik.sozluNote*0.2 + this.biyoloji.note*0.8+this.biyoloji.sozluNote*0.2) / 3.0;
            printNote();
            if (this.avarage > 55){
                System.out.println("Sınıfı Geçtiniz");
            }else {
                System.out.println("Sınıfta Kaldınız.");
            }


        }

        void printNote (){
            System.out.println("");
            System.out.println("Öğrenci : " + this.name);
            System.out.println("Tarih notu\t :" + this.tarih.note);
            System.out.println("Fizik notu\t :"  + this.fizik.note);
            System.out.println("Biyoloji notu \t :"+ this.biyoloji.note);
            System.out.println("Ortalamanız : " + this.avarage);
        }
    }


