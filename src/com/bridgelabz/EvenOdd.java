package com.bridgelabz;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Even numbers: ");
        for(int i = 0; i < size; i++) {
            if(array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\nOdd numbers: ");
        for(int i = 0; i < size; i++) {
            if(array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}