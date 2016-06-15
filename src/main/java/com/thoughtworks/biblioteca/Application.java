package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Application {
    private PrintStream printStream;
    private Library library;
    private Menu mainMenu;

    public Application(PrintStream printStream, Library library) {
        this.printStream = printStream;
        this.library = library;
        mainMenu = new Menu(printStream);
    }

    public void start(){
        printStream.println("Welcome");
        library.listBooks();
        mainMenu.showMenu();

    }


}
