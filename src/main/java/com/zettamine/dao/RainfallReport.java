package com.zettamine.dao;

import java.util.List;

import com.zettamine.dto.AnnualRainfall;

public interface RainfallReport {
	
	List<AnnualRainfall> findMaximumRainfallCities ();
	
	int  addAnnualRainfall(AnnualRainfall ar);
	

}
