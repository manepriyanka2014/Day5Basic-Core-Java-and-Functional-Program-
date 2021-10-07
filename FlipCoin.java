package com.bridgelab.program;
import com.bridgelab.utility.Utility;


public class FlipCoin
{
	public static void main(String[] args)// Flip main
	{
	Utility utility = new Utility();
	System.out.println("Enter the no. of coin toss");
	//System.out.println(utility.getIntValue());
	int numberOfFlips=utility.getIntValue();
	utility.fliCoinPercent(numberOfFlips);
	}

}
 