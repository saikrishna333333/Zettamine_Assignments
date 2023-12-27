package com.zettamine.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ProductSerilizationTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Product pob = null;
		System.out.println("how many products to be saved:");
		int n = s.nextInt();
		while(n-->0) {
			System.out.println("Enter product id");
			int pid = s.nextInt();
			s.nextLine();
			System.out.println("enter product name");
			String pname = s.nextLine();
			
			pob =new Product(pid,pname);
			ObjectOutputStream oos = null;
			
			try(FileOutputStream fos= new FileOutputStream
					("C:\\Users\\Gona Sai Krishna\\Desktop\\CustData\\stocks.ser")){
				oos = new ObjectOutputStream(fos);
				oos.writeObject(pob);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//while
		
		System.out.println("File Created");
		

	}

}
