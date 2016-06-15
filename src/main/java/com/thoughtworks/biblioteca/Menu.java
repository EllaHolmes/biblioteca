package com.thoughtworks.biblioteca;

import java.io.PrintStream;

public class Menu {
    private PrintStream printStream;

    public Menu(PrintStream printStream){
        this.printStream = printStream;
    }

    public void showMenu() {
        printStream.println("1: List Books");
    }


    //    private void mainMenu(BufferedReader reader) {
//        printStream.println("1: List Books");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String str = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
}
