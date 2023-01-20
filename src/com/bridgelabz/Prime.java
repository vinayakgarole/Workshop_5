package com.bridgelabz;

import java.util.Scanner;

public class Prime {

    public void checkData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No to Check: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                count = count + 1;
            }
        }

        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }

    public static void main(String[] args) {

        Prime pr = new Prime();
        pr.checkData();
    }
}
