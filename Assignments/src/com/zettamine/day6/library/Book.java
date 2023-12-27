package com.zettamine.day6.library;

import java.util.Objects;

public class Book {
	private long isbnNo;
	private String bookTitle;
	private String bookAuthor;
	public Book(long isbnNo, String bookTitle, String bookAuthor) {
		super();
		this.isbnNo = isbnNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}
	public long getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(long isbnNo) {
		this.isbnNo = isbnNo;
	}
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
	@Override
	public int hashCode() {
		return Objects.hash(bookAuthor, bookTitle, isbnNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(bookAuthor, other.bookAuthor) && Objects.equals(bookTitle, other.bookTitle)
				&& isbnNo == other.isbnNo;
	}
	@Override
	public String toString() {
		return "Book is bnNo=" + isbnNo + " \t| bookTitle=" + bookTitle + " | \tbookAuthor=" + bookAuthor +"\n" ;
	}
	
	

	

}
