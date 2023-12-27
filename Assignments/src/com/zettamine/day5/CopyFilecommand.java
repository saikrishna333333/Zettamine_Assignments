package com.zettamine.day5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFilecommand {

	public static void main(String[] args) throws IOException {
	     FileOutputStream fos = null;
	 
	     try {
	 
	          
	          Path path = Paths.get("C:\\Users\\Gona Sai Krishna\\Desktop\\CustData\\wrapper.txt");
	          
	          fos = new FileOutputStream(
	                "C:\\Users\\Gona Sai Krishna\\Desktop\\CustData\\WrapperClass Examples.txt");
	          Files.copy(path, fos);
	 
	        System.out.println("copied file successfully");
	        }
	 
	      finally {
	            if (fos != null) {
	            	fos.close();
	            }
	        }
	}

}
