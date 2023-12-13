package com.zettamine.day4;

public class Vechicle implements Loan,Insurance {
	private String vehicleNumber;
    private String modelName;
    private String vehicleType;
    private double price;
	public Vechicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public double takeInsurance() {
		if(this.price <= 150000) {
			return 3500;
		}else if(this.price > 150000 & this.price <= 300000) {
			return 4000;
		}
		else if(this.price > 300000) {
			return 5000;
		}
		return 0;
	}
	
	@Override
	public double issueLoan() {
		if(this.vehicleType.equals("4 wheeler")) {
			return (double)(85*price)/100;
			
		}else if(this.vehicleType.equals("3 wheeler")) {
			return (double)(75*price)/100;
			
		}else if(this.vehicleType.equals("2 wheeler")) {
			return (double)(50*price)/100;
		}
		else {
			return 0;
		}
		
	}
    


}
