package com.zettamine.day1;

import java.util.Scanner;

public class AverageAges {
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter total no. of employees: ");
		int noOfEmps = s.nextInt();
		int[] empAges = new int[noOfEmps];
		if(noOfEmps >2 ) {
			System.out.println("Enter the age of " + noOfEmps+ "employees");
			for(int i=0;i<empAges.length;i++) {
				int age = s.nextInt();
				if(age>=28 & age<=40) {
					empAges[i] = age;
				}else {
					System.err.println("Invalid age encountered!");
					System.exit(0);
				}
			}
			
		}else {
			System.err.println("Please enter a valid employee count");
			System.exit(0);
		}
		
		float res = calculateAverage(empAges);
		System.out.printf("%.2f",res);

	}

	private static float calculateAverage(int[] age) {
		double sum=0;
		for(int i=0;i<age.length;i++) {
			sum= sum +age[i];
		}
		 return (float)sum/age.length;
		
		
	}

}
