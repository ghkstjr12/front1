package week03.day13.실기;

public class Book { //문제7
	String bookCode;
	String bookTitle;
	String author;
	
	public Book(String bookCode, String bookTitle, String author) {
		super();
		this.bookCode = bookCode;
		this.bookTitle = bookTitle;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookCode=" + bookCode + ", bookTitle=" + bookTitle + ", author=" + author + "]";
	}
	
	
	
}
