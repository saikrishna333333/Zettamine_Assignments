package com.zettamine.day4;

public class SavingsAccount extends Account{
	private double minimumBalance;
	
	public SavingsAccount(int accountNumber, Customer customerObj, double balance ,double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amount) {
		double  bal = this.balance - amount;
		if(bal > minimumBalance) {
			return true;
		}
		return false;
	}

	
	
	
	

}
