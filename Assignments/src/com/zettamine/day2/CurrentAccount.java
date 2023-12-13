package com.zettamine.day2;

public class CurrentAccount extends Account{
	
	public CurrentAccount(long accNum, String name, double initialSeposit) {
		super(accNum, name, initialSeposit);
	}
	private final int ANNUAL_TRANSCATIONS = 3;
	private int transactions = 0;
	
	public void calculateTranscationFee() {
		if(transactions > ANNUAL_TRANSCATIONS) {
			double transFee = transactions - 3 * 25;
			this.debitAmount(transFee);
			transactions = 0;
			}
	}

}
