package com.zettamine.day3;

public class Hosteller extends Student {
	 private String hostelName;
	 private int roomNumber;
	
	public Hosteller(int studentId, String name, int departmentId, String gender, String phone, String hostelName, int roomNumber ) {
		super(studentId, name, departmentId, gender, phone);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
		
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


	@Override
	public String toString() {
		return   "studentId=" +this.getStudentId() + "\n\nStudent Name:" + this.getName() + "\n\ndepartmentId:" + this.getDepartmentId() + "\n\nStudent Gender:"
				+ this.getGender() + "\n\nStudent Phone No:" + this.getPhone()+"Hostel Name:" + this.getHostelName() + "Room No: " + this.getRoomNumber() ;
	}
	  


}
