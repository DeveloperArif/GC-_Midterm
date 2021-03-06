//@ Sasi, Anesha and Arif
package library;

import java.time.LocalDate;

// Book class that contains private fields, getters and setters for the same and 
// a default constructor and a parameterized constructor

public class Book {
	private String bookTitle;
	private String bookAuthor;
	private Status bookStatus;
	private LocalDate dueDate;

	// default constructor
	public Book() {	
	}
	
	// parameterized constructor
	public Book(String bookTitle, String bookAuthor,Status bookStatus,  LocalDate dueDate) {
		super();
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookStatus = bookStatus;
		this.dueDate = dueDate;
	}
	
	// getters and setters for the private variables
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate date) {
		this.dueDate = date;
	}
	public Status getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(Status bookStatus) {
		this.bookStatus = bookStatus;
	}
	
	@Override
	public String toString() {
		return bookTitle +"( "+ bookStatus + ")\n";
	}
}
