package com.zettamine.service;

import java.util.List;

import com.zettamine.dto.AnnualRainfall;

public interface RainfallReport_services {
	
	void addAnnualRainfall(AnnualRainfall ar);
	
	void findMaximumRainfallCities ();

}
