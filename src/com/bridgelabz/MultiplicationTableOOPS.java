package com.bridgelabz;

import java.util.Scanner;

public class MultiplicationTableOOPS {

    int multiply = 2;

    public void multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements Size.....");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Multiplication Table: ");

        for (int i = 0; i < arr.length; i++) {
            int[] temp = new int[num];
            temp[i] = arr[i] * multiply;
            System.out.println(" " + temp[i]);
        }
    }

    public static void main(String[] args) {

        MultiplicationTableOOPS multi = new MultiplicationTableOOPS();
        multi.multiply();
    }
}