package com.zettamine.day2;

public class Account {
	
	protected long accNum;
	protected String name;
	protected double balance;
	
	public Account(long accNum, String name, double initialSeposit) {
		super();
		this.accNum = accNum;
		this.name = name;
		this.balance = initialSeposit;
	}
	public double addAmount(double amount) {
		if(amount > 0) {
			this.balance += amount;
			return this.balance;
		}
		return -1.0;
	}
	public double debitAmount(double amount) {
		if(amount > 0 &&  this.balance > amount) {
			this.balance -= amount;
			return this.balance;
		}
		return -1.0;
	}
	
	public String getDetails() {
		return "Account Number : " + this.accNum +" ||  "
				+ "Name: " +this.name + " || "
				+ "Balance: "+this.balance;
	}

}
