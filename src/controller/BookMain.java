package controller;

import interfaces.IBook;
import service.BookIMPL;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        IBook book1 = new BookIMPL();

        int choice = 1;

        while (choice == 1) {
            System.out.println("Choose one of the given choice");
            System.out.println("1. Add Books Details. \n2. Display Details. \n0. Exit.");

            switch (sc.nextInt()) {
                case 1:
                    book1.addDetails();
                    break;
                case 2:
                    book1.display();
                    break;
                default:
                    choice = 0;
            }
        }
    }
}
