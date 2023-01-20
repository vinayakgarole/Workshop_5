package com.bridgelabz;

import java.util.Scanner;

public class SecondLargestAndSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = {5, 3, 7, 1, 9, 2, 8, 4, 6};

        // Find the second smallest number
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : numbers) {

            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        System.out.println("The second smallest number is: " + min2);

        // Find the second largest number
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : numbers) {

            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        System.out.println("The second largest number is: " + max2);
    }
}