package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class EvenOdd {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a number : ");
		int a = utility.getIntValue();
		utility.checkOddOrEven(a);
	}
}
