package com.bridgelabz;

import java.util.Scanner;

public class SecondSmallestLargestOOPS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        NumberFinder numberFinder = new NumberFinder(arr);
        int secondSmallest = numberFinder.findSecondSmallest();
        int secondLargest = numberFinder.findSecondLargest();

        System.out.println("The second smallest number is: " + secondSmallest);
        System.out.println("The second largest number is: " + secondLargest);
    }
}

class NumberFinder {
    private int[] arr;

    public NumberFinder(int[] arr) {
        this.arr = arr;
    }

    public int findSecondSmallest() {
        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = n;
            } else if (n < secondSmallest && n != firstSmallest) {
                secondSmallest = n;
            }
        }
        return secondSmallest;
    }

    public int findSecondLargest() {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = n;
            } else if (n > secondLargest && n != firstLargest) {
                secondLargest = n;
            }
        }
        return secondLargest;
    }
}