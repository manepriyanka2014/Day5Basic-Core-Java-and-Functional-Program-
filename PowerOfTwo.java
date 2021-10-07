package com.bridgelab.program;
import com.bridgelab.utility.Utility;

public class PowerOfTwo {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter the power of 2 in between 0 to 40) : ");
		int power = utility.getIntValue();
		utility.powerOfTwo(power);
	}
}