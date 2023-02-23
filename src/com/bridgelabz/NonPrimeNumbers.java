package com.bridgelabz;

public class NonPrimeNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for (int i = 0; i <= 100; i++) {
            numbers[i] = i;
        }

        for (int i = 2; i <= 100; i++) {
            if (numbers[i] != 0) {
                for (int j = 2 * i; j <= 100; j += i) {
                    numbers[j] = 0;
                }
            }
        }

        System.out.print("Non-prime numbers between 0 and 100: ");
        for (int i = 0; i <= 100; i++) {
            if (numbers[i] != 0 && numbers[i] != 1) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
