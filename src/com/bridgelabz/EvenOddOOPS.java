package com.bridgelabz;

public class EvenOddOOPS {

        // Method to print out even numbers
        public void printEvenNumbers(int[] numbers) {
            System.out.println("Even numbers: ");
            for (int number : numbers) {
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }

        // Method to print out odd numbers
        public void printOddNumbers(int[] numbers) {
            System.out.println("Odd numbers: ");
            for (int number : numbers) {
                if (number % 2 != 0) {
                    System.out.print(number + " ");
                }
            }
            System.out.println();
        }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create an instance of the NumberPrinter class and call the printEvenNumbers method
        EvenOddOOPS eo = new EvenOddOOPS();
        eo.printEvenNumbers(array);

        // Call the printOddNumbers method
        eo.printOddNumbers(array);
    }
}
