package service;

import interfaces.IBook;
import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookIMPL implements IBook {

    static ArrayList<Book> booksDetails = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void addDetails() {
        Book book = new Book();
        System.out.println("Enter the ID");
        int bookId = sc.nextInt();
        book.setId(bookId);
        System.out.println("Enter the name");
        String bookName = sc.next();
        book.setName(bookName);
        System.out.println("Enter the author");
        String author = sc.next();
        book.setAuthor(author);
        System.out.println("Enter the publisher");
        String publisher = sc.next();
        book.setPublisher(publisher);
        System.out.println("Enter the quantity");
        int quantity = sc.nextInt();
        book.setQuantity(quantity);

        booksDetails.add(book);
        System.out.println("Book ID         : " + book.getId());
        System.out.println("Book Name       : " + book.getName());
        System.out.println("Book Author     : " + book.getAuthor());
        System.out.println("Book Publisher  : " + book.getPublisher());
        System.out.println("Books Quantity  : " + book.getQuantity());
    }

    @Override
    public void display() {
        for (int i = 0; i < booksDetails.size(); i++) {
            System.out.println(booksDetails.get(i));
        }
    }
}
