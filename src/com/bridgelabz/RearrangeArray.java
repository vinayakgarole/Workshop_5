package com.bridgelabz;

import java.util.Arrays;

public class RearrangeArray {

    public static void swapArr(int[] arr, int i, int j) {
        int t_arr = arr[i];
        arr[i] = arr[j];
        arr[j] = t_arr;

    }

    public static void rearrangeArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                swapArr(arr, i - 1, i);
            }
            if (i + 1 < arr.length && arr[i + 1] > arr[i]) {
                swapArr(arr, i + 1, i);
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 6, 1, 3, 4, 5};
        System.out.println("Original array:\n" + Arrays.toString(arr));
        rearrangeArray(arr);
        System.out.println("\n Array with every second element is greater than its left and right elements:\n " + Arrays.toString(arr));
    }
}