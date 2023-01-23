package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.println("Enter Elements: ");
                arr[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Printing Elements: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println();

            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
        }
    }
}
