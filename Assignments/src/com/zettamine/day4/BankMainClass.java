package com.zettamine.day4;

import java.util.Scanner;

public class BankMainClass {
	static Scanner s = new  Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter A/C number:"); 
		int acno = s.nextInt();
		System.out.println("enter customer id:"); 
		int cid = Integer.parseInt(s.next());
		s.nextLine();
		System.out.println("enter customer name:"); 
		String name = s.nextLine();
		System.out.println("enter customer email:"); 
		String email =s.next();
		
		Customer cob =new Customer(cid,name,email);
		
		System.out.println("enter balance:"); 
		double balance =Double.parseDouble(s.next()) ;
		System.out.println("enter minimum balance:");
		double minbal =s.nextDouble();
		
		
		Account ac = new SavingsAccount(acno,cob,balance,minbal);
		
		System.out.println("enter amount to withdraw:"); 
		double amount = s.nextInt();
		
		if(ac.withdraw(amount)) {
			System.out.println("Rs." +amount + "  debited" + "| Balance: " +ac.getBalance());
		}
		

	}

}
