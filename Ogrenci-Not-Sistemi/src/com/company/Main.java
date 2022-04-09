package com.company;

public class Main {
    /*
        Öğrenci Not Sistemi
        Course Sınıfı Özellikleri :

        Nitelikler : name,code,prefix,note,Teacher
        Metotlar : Course() , addTeacher() , printTeacher()
        Teacher Sınıfı Özellikleri :
        Nitelikler : name,mpno,branch
        Metotlar : Teacher()
        Student Sınıfı Özellikleri :
        Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
        Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote()
        Ödev
        Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.
        Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
        Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :
        Fizik Ortalaması : (90 * 0.20) + (60* 0.80)

     */

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Hasan Kural", "90555501","TRH");
        Teacher t2 = new Teacher ("Araz Güldür", "90555502", "FZK");
        Teacher t3 = new Teacher("Azize Sevinç", "90555503", "BIO");

        Course tarih = new Course ("Tarih","101","TRH");
        Course fizik = new Course ("Fizik","102","FZK");
        Course biyoloji = new Course ("Biyoloji","103", "BIO");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        biyoloji.addTeacher(t3);

        Student s1 = new Student ("Ayşe Çakmak", "123","4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(50,30,40);
        s1.addSozluExamNote(60,40,50);
        s1.isPass();

        Student s2 = new Student ("Leyla Sönmez", "124","4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(70,40,70);
        s2.addSozluExamNote(40,70,40);
        s2.isPass();

        Student s3 = new Student ("Ahmet Kaplan", "125","4", tarih, fizik, biyoloji);
        s3.addBulkExamNote(75,75,90);
        s3.addSozluExamNote(90,60,90);
        s3.isPass();

    }
}

