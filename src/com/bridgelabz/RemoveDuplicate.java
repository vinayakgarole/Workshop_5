package com.bridgelabz;

public class RemoveDuplicate {

    public void duplicateElementsRemoveInArray(int[] arr) {

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != arr[i + 1]) {
                arr[temp] = arr[i];
                temp++;
            }
        }

        arr[temp] = arr[arr.length - 1];

        for (int i = 0; i < temp; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 3, 2, 4, 4, 5, 6, 6};
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        removeDuplicate.duplicateElementsRemoveInArray(arr);
    }
}

