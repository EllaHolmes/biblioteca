package com.thoughtworks.biblioteca;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static org.mockito.Mockito.*;


public class ApplicationTest {
    Application application;
    PrintStream printStream;
    Library library;

    @Before
    public void setUp(){
        //Arrange - Given
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        application = new Application(printStream, library);

    }

    @Test
    public void shouldWelcomeUserWhenStarting(){
        //Action - When
        application.start();
        //Assert - Then
        verify(printStream).println(contains("Welcome"));
    }

    @Test
    public void shouldListBooksWhenAfterWelcome(){
        //This will need to be deleted later!
        application.start();
        verify(library).listBooks();
    }

    @Test
    public void shouldShowMenuWhenAfterWelcome(){
        application.start();
        verify(printStream).println(contains("List Books"));
    }


}