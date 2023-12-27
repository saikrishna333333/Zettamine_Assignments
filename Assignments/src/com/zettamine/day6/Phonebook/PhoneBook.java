package com.zettamine.day6.Phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	
	private List<Contact> phoneBook = new ArrayList<Contact>();
	
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
	}
	
	public List<Contact> viewAllContacts() {
		return phoneBook;
	}
	
	public Contact viewContactByPhoneNo(long phoneNumber) {
		for(Contact c: phoneBook) {
			if(c.getPhoneNumber() == phoneNumber) {
				return c;
			}	
		}
		return null;
	}
	
	public boolean removeContact(long phoneNumber) {
		return phoneBook.removeIf(n->(n.getPhoneNumber()==phoneNumber));	
		
	}

}
