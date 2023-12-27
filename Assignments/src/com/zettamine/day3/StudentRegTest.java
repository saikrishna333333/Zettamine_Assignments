package com.zettamine.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRegTest {

	static Scanner s= new Scanner(System.in);

	public static void main(String[] args) {
List<StudentReg> students = new ArrayList<StudentReg>();
		
		do {
			System.out.println("enter student name and email: ");
			String name = s.nextLine();
			String email = s.nextLine();
			
			StudentReg st = new StudentReg(name, email);
			students.add(st);
			
			System.out.print("do you want to add more students?[Y/N] : ");
		}while(s.nextLine().equalsIgnoreCase("Y"));
		System.out.println("=".repeat(75));
		System.out.println("  STUD_ID  |     STUDENT NAME     |     STUDENT EMAIL       |  COLLEGE NAME" );
		System.out.println("=".repeat(75));
		for(StudentReg st : students) {
			System.out.println(st);
			System.out.println("-".repeat(75));
		}
		System.out.println("=".repeat(75));
		
	}//main
}
