package com.bridgelabz;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        int r, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int n = sc.nextInt();
        int c = n;

        while (n > 0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }

        if (c == s) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not Palindrome Number");
        }
    }
}
