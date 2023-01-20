package com.bridgelabz;

import java.util.Scanner;

public class ArrayProblem {

    public static void main(String[] args) {

        int sum = 0;
        int[] array1 = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");

        for (int i = 0; i < 6; i++) {
            array1[i] = sc.nextInt();
            System.out.println("The Sum: ");
        }
        int[] array2 = new int[6];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Numbers: ");

        for (int i = 0; i < 6; i++) {
            array2[i] = sc1.nextInt();
            sum = sum + array2[i];
        }
    }
}