package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size....");
        int n = sc.nextInt();
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
