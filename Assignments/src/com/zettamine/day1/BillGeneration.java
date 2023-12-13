package com.zettamine.day1;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter the no of pizzas bought: ");
		int pizzas = s.nextInt();
		System.out.println("Enter the no of puffs bought: ");
		int puffs = s.nextInt();
		System.out.println("Enter the no of cool drinks bought: ");
		int cooldrinks = s.nextInt();
		
		int costp = pizzas*100;
		
		int costpuf =puffs*20;
		
		int  costcd = cooldrinks*10;
		
		int totalPrice = costp+costpuf+costcd;
		
		System.out.println("Bill Details");
		System.out.println("No of Pizzas     :" +pizzas + "\tCost:" + costp);
		System.out.println("No of Puffs      :" +pizzas + "\tCost:" + costpuf);
		System.out.println("No of Coll Drinks:" +pizzas + "\tCost:" + costcd);
		
		System.out.println("\n\nTOTAL PRICE:" + totalPrice);
		System.out.println("ENJOY THE SHOW!!");
		s.close();

	}

}
