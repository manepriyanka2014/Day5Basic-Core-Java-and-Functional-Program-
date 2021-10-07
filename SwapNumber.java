package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class SwapNumber {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter first number : ");
		int a = utility.getIntValue();
		System.out.println("Enter second number : ");
		int b = utility.getIntValue();
		utility.swapNumbers(a, b);
	}
}
