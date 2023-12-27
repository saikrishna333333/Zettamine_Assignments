package com.zettamine.day5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDeserlization{
	static List<Product> product;
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		product = new ArrayList<Product>();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Gona Sai Krishna\\Desktop\\CustData\\stocks.ser");
			 
			ObjectInputStream ois=new ObjectInputStream(fis);
			Product prod;
			
			 while(true) {
				if(ois.read() !=-1) {
					prod=(Product) ois.readObject();
					System.out.println(prod);
					product.add(prod);
				}else {
					break;
				}
				 
			 }
			 
			 System.out.println("Enter Product id:");
			 int pid = s.nextInt();
//			 
//			boolean b =  idcheck(pid);
//			 if(b) {
//				 for(Product p:product) {
//					 if(p.getProductid() == pid) {
//						 System.out.println(p.getProductname());
//					 }else {
//						 System.out.println("Product is not avaliable");
//					 }
//				 }
//			 }else {
//				 System.out.println("Product is not Avaliable");
//			 }
			 
			 for(Product p:product) {
					 System.out.println(p.getProductid());
				 }
			 
		
	}

	private static boolean idcheck(int pid) {
		for(Product p:product) {
			 if(p.getProductid() == pid) {
				return true;	 }
			}
		return false;
		}
}
