package com.bridgelabz;

public class SeparatingZeros {

    public static void main(String[] args) {

        int[] arr = {0, 1, 2, 0, 3, 4, 0, 5};
        int[] result = separateAndSort(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] separateAndSort(int[] arr) {
        int nonZeroCount = 0;

        for (int num : arr) {

            if (num != 0) {
                nonZeroCount++;
            }
        }
        int[] result = new int[nonZeroCount];
        int index = 0;

        for (int num : arr) {

            if (num != 0) {
                result[index++] = num;
            }
        }

        for (int i = 0; i < nonZeroCount; i++) {

            for (int j = 0; j < nonZeroCount - 1; j++) {

                if (result[j] > result[j + 1]) {
                    int temp = result[j];
                    result[j] = result[j + 1];
                    result[j + 1] = temp;
                }
            }
        }
        return result;
    }
}