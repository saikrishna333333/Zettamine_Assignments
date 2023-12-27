package com.zettamine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.dto.AnnualRainfall;
import com.zettamine.service.RainfallReportService_impl;

public class AnnualRainfall_report_main {
	
	private static Connection con;

	public static void main(String[] args) {
		
		String filepath = "src/main/resources/AllCityMonthlyRainfall.txt";
		
		RainfallReportService_impl rainfallreport_ob = new RainfallReportService_impl();
		
		
		// inserting records into annual rainfall report table
		List<AnnualRainfall> list = generateRainfallReport(filepath);
	
		for(int i=0;i<list.size();i++) {
			AnnualRainfall aro = list.get(i);
			
			rainfallreport_ob.addAnnualRainfall(aro);
    	}
		
		
			
		//fetching all the records from the table 
		System.out.print(String.format("%-10s  %-20s  %-10s \n","cityPincode","CityName","AverageAnnualRainfall"));
		
		rainfallreport_ob.findMaximumRainfallCities();
		
		


	}
	public static List<AnnualRainfall>generateRainfallReport(String filePath){
		
		BufferedReader reader;
		List<AnnualRainfall> arlist = new ArrayList<AnnualRainfall>();

		try {
			reader = new BufferedReader(new FileReader(filePath));
			String line = reader.readLine();
			while (line != null) {
//				System.out.println(line);
				// read next line
				
				String[] arr = line.split(",");
				 String  pincode = arr[0] ;
				 
				 if(validate(pincode)) {
					int pin = Integer.parseInt(pincode);
					 String city = arr[1];
					 int sum =0;
					for(int i =2;i<arr.length;i++) {
						sum =sum + Integer.parseInt(arr[i]);
					}
					double avg =(double)sum/(arr.length-2);
					
					AnnualRainfall ar = new AnnualRainfall(pin, city, avg);
					
					arlist.add(ar);
					 
				 }else {
					 System.out.println("Invalid Pincode");
					 System.exit(0);
				 }
				 
				line = reader.readLine();
			}//while
			reader.close();
		}//try
		
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return arlist;
		
	}
	
	public static boolean validate(String cityPincode) {
		
		if(cityPincode.length() == 5) {
			return true;
		}else {	
			return false;
		}
	}
	

}
