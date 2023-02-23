package com.bridgelabz;

import java.util.Arrays;
import java.util.Scanner;

public class SaparatingZeros {

    public static void separating() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that is to be created: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        System.out.println("Enter the elements of the array: ");

        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        System.out.println("The array created is: " + Arrays.toString(myArray));
        System.out.println("Resultant array: ");
        int positioning = myArray.length - 1;

        for (int i = myArray.length - 1; i >= 0; i--) {

            if (myArray[i] != 0) {
                myArray[positioning] = myArray[i];
                positioning--;
            }
        }

        while (positioning >= 0) {
            myArray[positioning] = 0;
            positioning--;
        }
        System.out.println("The separated array is: --> " + Arrays.toString(myArray));
    }

    public static void main(String[] args) {

        SaparatingZeros.separating();
    }
}