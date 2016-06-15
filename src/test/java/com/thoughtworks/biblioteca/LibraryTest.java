package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    @Test
    public void shouldPrintBookWhenLibraryHasOneBook(){
        PrintStream printStream = mock(PrintStream.class);
        Book book = mock(Book.class);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book);
        Library library = new Library(books, printStream);

        library.listBooks();

        verify(book).printBook();

    }

    @Test
    public void shouldPrintListOfAllBooksWhenLibraryHasBooks(){
        PrintStream printStream = mock(PrintStream.class);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter", "J.K. Rowling", "2000", printStream));
        books.add(new Book("Life of Pi", "Yann Matel", "2010", printStream));
        Library library = new Library(books, printStream);

        library.listBooks();

        verify(printStream).format("%-20s  %-20s %-4s \n", "Harry Potter", "J.K. Rowling", "2000");
        verify(printStream).format("%-20s  %-20s %-4s \n", "Life of Pi", "Yann Matel", "2010");

    }

}