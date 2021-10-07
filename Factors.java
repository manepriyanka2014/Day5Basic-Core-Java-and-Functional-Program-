package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class Factors {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter Number you want to check Factor : ");
		int factorNumber1 = utility.getIntValue();
		utility.factorCheck(factorNumber1);
	}
}