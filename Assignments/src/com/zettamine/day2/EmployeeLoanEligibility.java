package com.zettamine.day2;

import java.util.Scanner;

public class EmployeeLoanEligibility {

	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		Loan loan = new Loan();
		System.out.println("choose type of employee:\n\t 1.Permanent Emplloyee \n\t2.TemporaryEmployee");
		switch(s.nextInt()) {
		case 1:
			System.out.println("Enter permenent employee id :");
			int pid = Integer.parseInt(s.next());
			s.nextLine();
			System.out.println("Enter permenent employee name");
			String pname = s.nextLine();
			System.out.println("enter permenent employee basic pay");
			int bpay = Integer.parseInt(s.next());
			Employee pel = new PermanentEmployee(pid, pname, bpay);
			
			pel.calculateSalary();
			System.out.println(pel);
			System.out.println("Loan Amount Eligible: " + loan.calculateLoanAmount(pel));
		
			break;
		case 2:
			System.out.println("Enter temp employee id :");
			int tid = Integer.parseInt(s.next());
			s.nextLine();
			System.out.println("Enter temp employee name :");
			String tname = s.nextLine();
			System.out.println("Enter temp employee hoursWorked : ");
			int thour = Integer.parseInt(s.next());
			
			System.out.println("Enter temp employee hourlyWages: ");
			int twag = Integer.parseInt(s.next());
			
			Employee tel = new TemporaryEmployee(tid,tname,thour,twag);

			tel.calculateSalary();
			System.out.println(tel);
			System.out.println("Loan Amount Eligible: " + loan.calculateLoanAmount(tel));

			break;
		default:
			System.out.println("invalid option try again...");
		}
		
		
			
		
		
		
	}
}
