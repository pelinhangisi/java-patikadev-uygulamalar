package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 20);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
