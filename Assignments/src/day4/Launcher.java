package day4;

import java.util.Scanner;

public class Launcher {
	static Scanner s =new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter vehicleNumber: ");
		String vehicleNumber = s.next();
		System.out.print("Enter Model Name:");
		String model = s.next();
		System.out.print("Enter Vechicle Type:");
		String vtype =s.nextLine();
		System.out.print("Enter Vechicle Price: ");
		double price = Double.parseDouble(s.next());
		
		Vechicle vob = new Vechicle(vehicleNumber,model,vtype,price);
		double insuranceamt = vob.takeInsurance();
		double loanamt = vob.issueLoan();
		System.out.println("insurance amount: " + insuranceamt );
		System.out.println("Loan amount: " + loanamt );

	}

}
