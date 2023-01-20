package com.bridgelabz;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n = 10;
        int a = 0;
        int b = 1;
        int c;

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
