package com.thoughtworks.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books, PrintStream printStream) {
        this.books = books;
    }


    public void listBooks() {

        for(Book book: books){
            book.printBook();
        }

    }
}
