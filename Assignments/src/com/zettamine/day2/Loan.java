package com.zettamine.day2;



public class Loan  {
	
	public double calculateLoanAmount(Employee employeeObj) {
		
		if(employeeObj instanceof PermanentEmployee) {
			return (employeeObj.getSalary() * 15)/100;
		}
		else {
			return (employeeObj.getSalary() * 10)/100;
		}
	
	}

}
