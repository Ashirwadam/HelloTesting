package com.cts.test;



import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.mockito.Mockito.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

//Provide necessary Annotation to class, attributes and test methods

public class GenerateISBNTest {


    public Book book;


    public GenerateISBN service;

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        book=spy(new Book("book1"));
        service=spy(new GenerateISBN(book));


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSuccess()throws Exception {
        //fill code
        doReturn(service.getBook()).when(service).assignISBN("ISBN1234");
//        when(service.assignISBN("ISBN1234")).thenReturn(service.getBook());
        book=service.assignISBN("ISBN1234");
        System.out.println(book.getIsbn());
//        verify(book,times(2)).setIsbn("ISBN1234");

    }

	/*@Test
	public void testFailed() {

		//fill code
		exceptionRule.expect(Exception.class);
		exceptionRule.expectMessage("Invalid Code");

	    when(service.assignISBN("BN1234")).thenThrow(new RuntimeException("Invalid Code"));
	    Book b1=service.assignISBN("BN1234");

	}

	@Test(expected=RuntimeException.class)
	public void testException() {
	    	//fill code
		when(service.assignISBN("BN1234")).thenThrow(new RuntimeException("Invalid Code"));
	    Book b1=service.assignISBN("BN1234");
	}*/
}