package com.zettamine.day2;

import java.util.Scanner;

public class TicketPriceCalculation {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter no of bookings:");
		int bookings = s.nextInt();
		
		System.out.println("Enter the available tickets: ");
		Ticket.setAvailableTickets(s.nextInt());
		if(Ticket.getAvailableTickets()>0) {
			while(bookings-->0) {
				System.out.println("Enter the ticketid");
				int ticketid = s.nextInt();
				System.out.println("Enter the price: ");
				int price = s.nextInt();
				System.out.println("Enter the no of tickets: ");
				int nooftickets = s.nextInt();
				Ticket tob = new Ticket(ticketid,price);
			
				System.out.println("Available tickets: " + Ticket.getAvailableTickets());
				
				int tprice = tob.calculateTicketCost(nooftickets);
				
				System.out.println("Total amount:" + tprice);
				System.out.println("Available ticket after booking: \n"+ Ticket.getAvailableTickets() );
				
			}
		}else {
			System.out.println("Avaliable tickets should be positive number...!");
		}
		
		
		
		

	}

}
