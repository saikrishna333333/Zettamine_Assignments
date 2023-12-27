package com.zettamine.service;

import java.util.List;

import com.zettamine.dao.RainfallReport;
import com.zettamine.dao.RainfallReportImpl;
import com.zettamine.dto.AnnualRainfall;

public class RainfallReportService_impl implements RainfallReport_services {
	
	private static RainfallReport rfr;


	public RainfallReportService_impl() {
		super();
		
		rfr = new RainfallReportImpl();
		
	}

	@Override
	public void findMaximumRainfallCities() {
		
		List<AnnualRainfall> anrlist = rfr.findMaximumRainfallCities();
		
		for(AnnualRainfall ar : anrlist) {
			System.out.println(ar.toString());
		}
		

	}

	@Override
	public void addAnnualRainfall(AnnualRainfall ar) {
		int recordAdded = rfr.addAnnualRainfall(ar);
		
		if(recordAdded > 0) {
			System.out.println("Record ineserted successfull..");
		}
		else {
			System.out.println("insert operation failed...");
		}
	}

}
