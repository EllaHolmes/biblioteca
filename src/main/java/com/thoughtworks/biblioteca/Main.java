package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        PrintStream printStream = System.out;

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "J.K. Rowling", "2000", printStream));
        books.add(new Book("Life of Pi", "Yann Matel", "2010", printStream));
        Library library = new Library(books, printStream);

        Application application = new Application(printStream, library);
        application.start();
    }
}
