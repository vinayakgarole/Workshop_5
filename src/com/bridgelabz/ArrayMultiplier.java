package com.bridgelabz;

public class ArrayMultiplier {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int product = 2;

        for (int i = 0; i < array.length; i++) {
            product = product * array[i];
        }

        for (int i=0; i<array.length; i++) {
            System.out.println(product * array[i]);
        }

        System.out.println("The product of the array elements is: " + product);
    }
}
