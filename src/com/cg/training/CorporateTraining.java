package com.cg.training;

//CorporateTraining class inherits instances from Training class
public class CorporateTraining extends Training {
	private int days;
	
	//defining a constructor for taking inputs from the user 
	public CorporateTraining(int f, String s, int d) {
		super.fees = f;
		super.subject = s;
		this.days = d;
	}
	
	//overriding the getOrderValue function for Public Training
	//here, the charges depends upon the number of days
	public int getOrderValue() {
		int charges = fees*days;
		return charges;
	}

}