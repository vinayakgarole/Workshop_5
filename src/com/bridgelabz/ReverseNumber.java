package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int rem;
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Reverse Number");

        while (num > 0) {
            rem = num % 10;
            System.out.print(rem);
            num = num / 10;
        }
    }
}
