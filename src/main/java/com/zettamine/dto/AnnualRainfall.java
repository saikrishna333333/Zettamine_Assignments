package com.zettamine.dto;

public class AnnualRainfall {
	private int cityPincode;
	private String cityName;
	private double averageAnnualRainfall;
	
	
	public AnnualRainfall(int cityPincode, String cityName, double averageAnnualRainfall) {
		super();
		this.cityPincode = cityPincode;
		this.cityName = cityName;
		this.averageAnnualRainfall = averageAnnualRainfall;
	}
	
	public int getCityPincode() {
		return cityPincode;
	}
	public void setCityPincode(int cityPincode) {
		this.cityPincode = cityPincode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public double getAverageAnnualRainfall() {
		return averageAnnualRainfall;
	}
	public void setAverageAnnualRainfall(double averageAnnualRainfall) {
		this.averageAnnualRainfall = averageAnnualRainfall;
	}

	@Override
	public String toString() {
	   return String.format("%-10d  %-20s  %-10s \n" ,cityPincode,cityName,averageAnnualRainfall);
	}
	
	
	
	


}
