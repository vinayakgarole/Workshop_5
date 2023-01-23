package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        int sum = 0;
        System.out.println("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}
