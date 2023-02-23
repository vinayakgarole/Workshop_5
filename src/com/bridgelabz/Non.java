package com.bridgelabz;

import java.util.Scanner;

public class Non {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows in the 2D array: ");
            int rows = sc.nextInt();
            System.out.println("Enter the number of columns in the 2D array: ");
            int columns = sc.nextInt();
            int[][] arr = new int[rows][columns];
            System.out.println("Enter the elements of the 2D array: ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println("The non-repeating element is: " + findNonRepeatingElement(arr, rows, columns));
        }

        public static int findNonRepeatingElement(int[][] arr, int rows, int columns) {
            int[] count = new int[10];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    count[arr[i][j]]++;
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (count[arr[i][j]] == 1) {
                        return arr[i][j];
                    }
                }
            }
            return -1;
        }
    }
