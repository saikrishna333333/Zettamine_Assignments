package day1;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Inmate's name: ");
		String name = s.nextLine();
		
		System.out.println("Inmate's father's name: ");
		String lname = s.nextLine();
		
		if(name.matches("^[A-Za-z ]+$") & lname.matches("^[A-za-z ]+$")) {
			System.out.println(name +" "+ lname);
		}else {
			System.err.println("Invalid name");
		}
		s.close();

	}

}
