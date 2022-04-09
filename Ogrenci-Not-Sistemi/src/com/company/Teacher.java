package com.company;

public class Teacher {
    String name;
    String mpno;
    String branch;


    Teacher (String name, String mpno, String branch){
        this.name = name ;
        this.mpno = mpno;
        this.branch = branch;


    }

    void print (){

        System.out.println("Adı : " + this.name);
        System.out.println("Telefon numarası : " + this.mpno);
        System.out.println("Branşı : " + this.branch);

    }
}


