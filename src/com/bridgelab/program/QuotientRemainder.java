package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class QuotientRemainder {
		    public static void main(String[] args) {
		    Utility utility = new Utility();
	        System.out.println("Enter Dividend and Divisor : ");
	        int dividend =utility.getIntValue();
	        int divisor=utility.getIntValue();
	        utility.quotientAndRemainder(dividend,divisor);
	    }
}


