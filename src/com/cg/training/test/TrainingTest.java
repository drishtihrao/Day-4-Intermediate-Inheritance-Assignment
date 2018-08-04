package com.cg.training.test;

import com.cg.training.CorporateTraining;
import com.cg.training.PublicTraining;
import com.cg.training.Training;

//class to test the method defined in training class 
public class TrainingTest {

	public static void main(String[] args) {
		// passing values for fees, subject, no. of participants using a constructor
		Training PA = new PublicTraining(5000, "Java", 50);
		// passing values for fees, subject, no. of days using a constructor
		Training CA = new CorporateTraining(35000, "Big Data", 4);

		//printing the charges for public and corporate training
		System.out.println("The training charges for PA is " + PA.getOrderValue());
		System.out.println("The training charges for CA is " + CA.getOrderValue());
	}

}
