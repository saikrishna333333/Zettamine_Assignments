package com.zettamine.day5;

import java.io.File;

public class RenameCommand {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\Gona Sai Krishna\\Desktop\\CustData\\hello.txt"); 

		File rename = new File("C:\\Users\\Gona Sai Krishna\\Desktop\\CustData\\files.txt"); 

		boolean flag = file.renameTo(rename); 

		if (flag == true) { 
			System.out.println("File Rename Success"); 
		} 
		else { 
			System.out.println("Operation Failed"); 
		} 
	
	}


}
