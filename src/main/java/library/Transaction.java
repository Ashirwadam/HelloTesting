package library;
import java.util.Date;

public class Transaction {
    final private Member member;
    final private Book book;
    final private int transactionId;
    final private String transactionType;
    private static final int NO_OF_BOOKS =0;
    final private Date transactionDate;
    private Date bookTobeReturnDate;
    final private double penalty;
    private Date bookReturnDate;


    public Transaction(Member member, Book book, int transactionId, String transactionType, Date transactionDate,
                       double penalty) {
        super();
        this.member = member;
        this.book = book;
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.penalty = penalty;
    }
    public Date getBookTobeReturnDate() {
        return bookTobeReturnDate;
    }

    public Member getMember() {
        return member;
    }
    public Book getBook() {
        return book;
    }
    public int transactionId() {
        return transactionId;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public static int getNoOfBooks() {
        return NO_OF_BOOKS;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }

    public double getPenalty() {
        return penalty;
    }
    public Date getBookReturnDate() {
        return bookReturnDate;
    }



}
