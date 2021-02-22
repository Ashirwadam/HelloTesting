package com.cts.test;

import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

//Provide necessary Annotation to class, attributes and test methods

public class GenerateISBNTest1 {
    @Mock
    Book book;
    @InjectMocks
    GenerateISBN service;
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        initMocks(this);
//        service = spy(new GenerateISBN(book));
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testSuccess() {
        service.assignISBN("ISBN0000");
        verify(book, times(1)).setIsbn("ISBN0000");

    }
    @Test
    public void testFailed() {
        //fill code
        try {
            service.assignISBN("ISBN000");
        } catch (Exception e) {

        }
        verify(book, times(0)).setIsbn(anyString());



    }
    @Test
    public void testException() {
        //fill code
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Invalid Code");
        service.assignISBN("ISBN000");

    }
}
