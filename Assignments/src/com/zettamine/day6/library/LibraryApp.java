package com.zettamine.day6.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
	static Scanner s = new Scanner(System.in);
	static Library lb = new Library();

	public static void main(String[] args) {
		while(true){
			System.out.println("1. Add Book\r\n"
					+ "2. Display all Book Details\r\n"
					+ "3. Search Book by Author \r\n"
					+ "4. Count Number of books - by book name\r\n"
					+ "5. Exit\r\n");
			switch(s.nextInt()) {
			case 1:
				System.out.println("Enter the isbn no: ");
				int isbn = s.nextInt();
				s.nextLine();
				System.out.println("Enter the book name:");
				String bname = s.nextLine();
				System.out.println("Enter the author name:");
				String author = s.nextLine();
				Book boj = new Book(isbn,bname,author);
				lb.addBook(boj);
				break;
			case 2:
				List<Book> books = lb.viewAllBooks();
				for(Book b: books) {
					System.out.println(b.toString());
				}
				
				break;
			case 3:
				System.out.println("Enter name of Author:");
				
				String nameauthor = s.next();
				ArrayList<Book> albyauthors = lb.viewBooksByAuthor(nameauthor);
				for(Book a: albyauthors) {
					System.out.println(a.toString());
				}
				
				
				break;
			case 4:
				System.out.println("Enter book name:");
				String sbname = s.next();
				int sbybook = lb.countNoOfBook(sbname);
				System.out.println(sbybook);
				break;
			case 5:
				System.exit(0);
			default:
				break;
				
			}//switch
			
		}//while
		
		

	}

}
