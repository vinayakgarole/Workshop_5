package com.bridgelabz;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements Size.....");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int multiply = 2;
        System.out.println("Enter Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Multiplication Table");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] * multiply + " ");
        }
    }
}