package com.bridgelabz;

import java.util.Scanner;

public class Practice {

    void multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int multiply = 2;
        System.out.println("Enter Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Multiplication Table");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * multiply;
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        Practice practice = new Practice();
        practice.multiply();
    }
}
