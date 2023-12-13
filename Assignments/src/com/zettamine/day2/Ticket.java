package com.zettamine.day2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Setter
@Getter

public class Ticket{
	private	int ticketid;
	private	int price;
	private	static int availableTickets;
	
	public static int getAvailableTickets() {
		return availableTickets;
	}

	public static void setAvailableTickets(int availableTickets) {
		Ticket.availableTickets = availableTickets;
	}

	
	public int calculateTicketCost(int nooftickets) {
		int totalprice = this.price * nooftickets;
		availableTickets = availableTickets - nooftickets;
		if(availableTickets >0) {
			return totalprice;
		}
		return -1;	
	}


	

}
