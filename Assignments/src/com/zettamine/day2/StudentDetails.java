package com.zettamine.day2;

import java.util.Scanner;

public class StudentDetails {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Student's Id: ");
		int sid = s.nextInt();
		s.nextLine();
		System.out.println("Enter Student's Name: ");
		String name = s.nextLine();
		System.out.println("Enter Student's address:");
		String addr = s.nextLine();
		System.out.println("Whether the student is from NIT(Yes/No): ");
		String collegecheck =s.nextLine();
		if(collegecheck.equals("No") | collegecheck.equals("no")) {
			System.out.println("Enter the college name:");
			String clgname = s.nextLine();
			Student ob1 = new Student(sid,name,addr,clgname);
			String res = ob1.toString();
			System.out.println(res);
			System.exit(0);
		}
		if(collegecheck.equals("Yes") | collegecheck.equals("yes")){
			Student ob2 = new Student(sid,name,addr);
			String res = ob2.tostring();
			System.out.println(res);
		}
		else {
			System.out.println("invalid input");
		}
		
		
	}

}
