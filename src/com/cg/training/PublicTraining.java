package com.cg.training;
/*
 * Public Training class inherits instances from Training class
 */
public class PublicTraining extends Training {
	private int participants;
	
	//defining a constructor for taking inputs from the user 
	public PublicTraining(int f, String s, int p) {
		super.fees = f;
		super.subject = s;
		this.participants = p;
	}
	
	//overriding the getOrderValue function for Public Training
	//here, the charges depends upon the number of participants
	public int getOrderValue() {
		int charges = fees*participants;
		return charges;
	}
}