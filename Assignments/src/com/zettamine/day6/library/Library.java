package com.zettamine.day6.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
	List<Book> bookList = new  ArrayList<Book>();
	ArrayList<Book> albook = new ArrayList<Book>();

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	void addBook(Book bobj) {
		bookList.add(bobj);
	}
	
	boolean isEmpty() {
		return bookList.isEmpty();
		
	}
	
	List<Book> viewAllBooks() {
		return bookList;
		
	}
	
	ArrayList<Book> viewBooksByAuthor(String author){
		for(Book b: bookList) {
			if(b.getBookAuthor().equals(author)) {
				albook.add(b);
			}
		}
		return albook;
		
		
	}
	
	int countNoOfBook(String bname) {
		for(Book b: bookList) {
			if(b.getBookTitle().equals(bname)) {
				albook.add(b);
			}
		}
		return albook.size();
	
	}
	
}
	
