package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Book {
    String title;
    String author;
    String date;
    private PrintStream printStream;

    public Book(String title, String author, String date, PrintStream printStream){
        this.title = title;
        this.author = author;
        this.date = date;
        this.printStream = printStream;
    }

    public void printBook(){
        printStream.format("%-20s  %-20s %-4s \n", title , author, date);
    }
}
