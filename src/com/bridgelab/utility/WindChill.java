package com.bridgelab.utility;

public class WindChill {
	 public static void main(String[] args) {
	        Utility utility=new Utility();
	        System.out.println("Enter Temperature(in Fahrenheit) and Velocity(miles per hour)  : ");
	        float t =utility.getIntValue();
	        float v =utility.getIntValue();
	        utility.WindChill(t,v);
	    }

}
