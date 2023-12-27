package com.zettamine.day3;

public class StudentReg {
	private static int num =100;
	private String studentId;
	private String name;
	private String email;
	private final static String COLLEGE_NAME = "SK institutions";
	
	{
		studentId = ("ZETTA_" + (num++)) ;
	}
	
	

	public StudentReg (String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public  String getStudentId() {
		return studentId;
	}

	public  void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public static String getCollegeName() {
		return COLLEGE_NAME;
	}


	@Override
	public String toString() {
		return String.format("%-10s | %-20s | %-25s | %-12s", studentId, name, email, COLLEGE_NAME );
	}
	

	
	

}
