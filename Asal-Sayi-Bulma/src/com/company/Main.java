package com.company;

public class Main {

    public static void main(String[] args) {
	// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız
        int start=2, end=100;

        for (int i=start; i<=end; i++){
            boolean isPrime=true;
            for (int n = 2; n <=i/2; n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i+ "-");
            }
        }
    }
}
