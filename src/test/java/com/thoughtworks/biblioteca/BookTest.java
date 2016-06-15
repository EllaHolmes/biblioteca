package com.thoughtworks.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {

    @Test
    public void shouldPrintBookDetailsOfThisBook(){

        PrintStream printStream = mock(PrintStream.class);
        Book book = new Book("Harry Potter", "J.K. Rowling", "2000", printStream);
        book.printBook();

        verify(printStream).format("%-20s  %-20s %-4s \n", "Harry Potter", "J.K. Rowling", "2000");

    }

}