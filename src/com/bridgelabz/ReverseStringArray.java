package com.bridgelabz;

import java.util.Scanner;

public class ReverseStringArray {

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();
        int n = charArray.length;
        for (int i = 0; i < n / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[n - i - 1];
            charArray[n - i - 1] = temp;
        }
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversed = reverse(str);
        System.out.println("The reverse of the string is: " + reversed);
    }
}