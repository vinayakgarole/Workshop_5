package com.bridgelabz;

import java.util.ArrayList;

public class MultipleOf5 {

    public static int multiple() {

        int count = 0;
        final ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Multiple of 5 are: ");

        for (int i = 1; i < 100; i++) {

            if (i % 5 == 0) {
                arr.add(i);
                count++;
            }
        }

        for (int j = 0; j < arr.size(); j++) {
            System.out.print(arr.get(j) + " ");
        }
        System.out.println();
        return arr.size();
    }

    public static void main(String[] args) {

        System.out.println("Count of Numbers are:  " + multiple());
    }
}
