package com.bridgelabz;

public class MultiplicationValue {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int multiply = 2;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * multiply;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println("New Array");

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            System.out.println(" " + temp);
        }
    }
}
