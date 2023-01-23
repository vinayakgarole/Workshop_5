package com.bridgelabz;

public class PalindromeCheck {

    public static void main(String[] args) {

        String input = "racecar";
        int length = input.length();
        int i;
        String reversed = "";

        // reverse the input string
        for (i = length - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // compare the reversed string to the original input
        for (i = 0; i < length; i++) {

            if (input.charAt(i) != reversed.charAt(i)) {
                System.out.println("Not a palindrome.");
                return;
            }
        }
        System.out.println("Is a palindrome.");
    }
}
