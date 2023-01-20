package com.bridgelabz;

public class Pattern {

    public static void main(String[] args) {


        int number = 1;
        int rowSizing = 5;

        for (int j = 0; j < rowSizing; j++) {

            for (int i = rowSizing - 1; i > j; i--) {
                System.out.print("  ");
            }

            for (int i = 0; i < number; i++) {
                System.out.print(" " + number);
            }
            number += 2;
            System.out.println();
        }


        /*
         * int i, j, n=12,k = 1;
         *
         * for ( i = 0; i < n; i++) { k = (i * (i + 1)) / 2; for (j = 0; j < i; j++) {
         * System.out.printf( "  " + "%3d", k); k--; } System.out.println(); }
         */

        /*
         * int i, j, n = 12, k = 1; for (i = 1; i < n; i++) { if (i % 2 == 0) { for (j =
         * 1; j <= i; j++) { System.out.printf("%3d", k); k--; } System.out.println(); k
         * = k + i + 1;
         *
         * } else { for (j = 1; j <= i; j++) { System.out.printf("%3d", k); k++;
         *
         * } System.out.println(); k = k + i; } }
         */

    }
}