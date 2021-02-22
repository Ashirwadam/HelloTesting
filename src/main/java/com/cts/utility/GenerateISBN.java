package com.cts.utility;

public class GenerateISBN {
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    private Book book;

    public GenerateISBN(Book book) {
        super();
        this.book = book;
    }

    public Book assignISBN(String isbn) {
        if(isbn.matches("ISBN[0-9]{4}")) {
            book.setIsbn(isbn);
            System.out.println("Here" + getBook().getIsbn());
        }else {
            throw new RuntimeException("Invalid Code");
        }
        return book;
    }
}
