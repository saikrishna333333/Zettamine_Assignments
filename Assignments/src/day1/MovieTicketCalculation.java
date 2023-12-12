package day1;

import java.util.Scanner;

public class MovieTicketCalculation {
	static Scanner s = new Scanner(System.in);
	static double totalCost=0;
	static String circle;

	public static void main(String[] args) {
		
		System.out.println("Enter No Of Tickets: ");
		int n = Integer.parseInt(s.next());
		
		
		if(n>=5 & n<=40) {
			System.out.println("Enter the circle:");
			//s.next();
			 circle = s.next().toUpperCase();
			
			if(circle.equals("K") | circle.equals("Q")) {
				totalCost = totalCost + circle();
			}
			else {
				System.out.println("Invalid Input");
				System.exit(0);
			}
			totalCost = totalCost - discount(n); //discount on tickets if total tickets more than 20
			
			totalCost= totalCost - cuponCode(); //2% discount on total cost if coupon code is there 
			double refcost= refershment(n);
			totalCost = totalCost + refcost;
			
			System.out.println("TicketCost:" + totalCost);
	}
		else {
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
}//end of main method
	

	private static double circle() {
		
		if(circle.equals("K")) {
			totalCost = totalCost + totalCost*75;
			return totalCost;
		}
		if(circle.equals("Q")) {
			totalCost = totalCost + totalCost*150;
			return totalCost;
		}
		return 0;
	}


	private static double refershment(int n) {
		
			System.out.println("Do you want refreshment: ");
			String ref = s.next().toUpperCase();
			if(ref.equals("Y")) {
				totalCost=n*50;
				return totalCost;
			}
			return 0;
			
	}
	
	private static double cuponCode() {

		System.out.println("Do you have coupon code:" );
		String ccode = s.next().toUpperCase();
		if(ccode.equals("Y")) {
			double cdis = (totalCost/100)*2;
			return cdis;
		}
		else {
			return 0;
		}
		
	}
	
	private static double discount(int n) {
		if(n>=20) {
		double disc	 = (totalCost/100)*10;
			return disc;
		}
		return 0;
	}

}
