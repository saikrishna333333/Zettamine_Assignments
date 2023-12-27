package com.zettamine.day2;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;
	private static String college = "NIT";
	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
	
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public static String getCollege() {
		return college;
	}
	public static void setCollege(String college) {
		Student.college = college;
	}

	@Override
	public String toString() {
		return "Student id:12" + studentId + "\n\nStudent name: " + studentName + "\n\nAddress: " + studentAddress
				+ "\n\nCollege Name: " + collegeName ;
	}
	
	public String tostring() {
		return "Student id:12" + studentId + "\n\nStudent name: " + studentName + "\n\nAddress: " + studentAddress
				+ "\n\nCollege Name: " + college ;
	} 
	


}
