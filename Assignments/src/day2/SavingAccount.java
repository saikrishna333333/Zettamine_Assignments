package day2;

public class SavingAccount extends Account {
	private double roi = 3;
	
	public SavingAccount(long accNum, String name, double balance) {
		super(accNum, name, balance);
	}
	public double calculateRoi(double roi) {
		
		if(roi > 0.0) {
		double rateOfInterest =  balance * roi;
		this.addAmount(rateOfInterest);
		return rateOfInterest;
		}
		return -1.0;
	}

}
