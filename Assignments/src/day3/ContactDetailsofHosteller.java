package day3;

import java.util.Scanner;

public class ContactDetailsofHosteller {
	static Scanner s = new Scanner(System.in);
	static Hosteller hs =null;
	static int rno;
	static String phno;

	public static void main(String[] args) {
		System.out.println("Enter the Student Details & Hostel Details\n");
				System.out.println("Student ID:");
				int sid = s.nextInt();
				s.nextLine();
				System.out.println("Student Name:");
				String name = s.nextLine();
				System.out.println("Department Id:");
				int deptid = Integer.parseInt(s.nextLine());
				//s.nextLine();
				System.out.println("Gender[M/F]:");
				String gender = s.nextLine();
				System.out.println("Phone Number:");
				 phno =s.nextLine();
				
				System.out.println("Hostel Name:");
				String hname = s.nextLine();
				System.out.println("Room Number:");
				 rno = Integer.parseInt(s.nextLine());
				
				 hs =getHostellerDetails();
				 hs =new Hosteller(sid, name, deptid,
							gender, hname, phno, rno) ;
				 System.out.println(hs.toString());
				 
				
				
	}
	
	public static Hosteller getHostellerDetails(){
		
		System.out.println("Modify Room Number(Y/N):");
		String mrn = s.nextLine().toUpperCase();
		
		if(mrn.equals("Y")) {
			System.out.println("New Room Number:");
			rno = s.nextInt();
			s.nextLine();	
		}
		
		System.out.println("Modify Phone Number(Y/N):");
		String mphno = s.nextLine().toUpperCase();
		if(mphno.equals("Y")) {
			System.out.println("New Phone Number:");
			 phno = s.nextLine();	
		}
		
		return hs;
	}

}
