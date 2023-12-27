package com.zettamine.day6.Phonebook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner s = new Scanner(System.in);
	static PhoneBook phbook = new PhoneBook();

	public static void main(String[] args) {
		
		
		while(true) {
			System.out.println("Main");
			System.out.println("1. Add Contact\r\n"
					+ "2. Display all Contacts\r\n"
					+ "3. Search Contact by phone \r\n"
					+ "4. Remove Contact\r\n"
					+ "5. Exit\r\n");
			System.out.println("Enter Your Choice:");
			switch(s.nextInt()) {
			case 1:
				System.out.println("Enter the First Name:");
				s.nextLine();
				String fname = s.nextLine();
				System.out.println("Enter the Last Name:");
				String lname = s.nextLine();
				System.out.println("Enter the Phone No.:");
				long phno = Long.parseLong(s.nextLine());
				System.out.println("Enter the Email: ");
				String email =s.next();
				
				Contact contact = new Contact(fname,lname,phno,email);
				
				phbook.addContact(contact);
				
				break;
			case 2:
				List<Contact> allcontacts = phbook.viewAllContacts();
				Iterator<Contact> itr = allcontacts.iterator();
				
				while(itr.hasNext()) {
					System.out.println(itr.next().toString());
				}
				
				break;
			case 3:
				System.out.println("Enter Phone Number : ");
				long phnotoread = s.nextLong();
				Contact contactbyphno = phbook.viewContactByPhoneNo(phnotoread);
				if(!contactbyphno.equals(null)) {
					System.out.println("The contact is:" + contactbyphno.toString());
				}else {
					System.out.println("No Contacs with the given Phone Number");
				}
				break;
			case 4:
				System.out.println("Enter the Phone number to remove : ");
				long phnotoRemove = s.nextLong();
				System.out.println("Do you want to remove the contact (Y/N): ");
				String cr = s.next().toLowerCase();
				if(cr.equals("y")) {
					if(phbook.removeContact(phnotoRemove)) {	
					System.out.println("The contact is successfully deleted.");
					}
				}
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("invalid choice of operation try again....");
				break;
				
			
			}
			
		}//while

	}

}
