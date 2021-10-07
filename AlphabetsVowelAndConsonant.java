package com.bridgelab.program;

import com.bridgelab.utility.Utility;

public class AlphabetsVowelAndConsonant {
	public static void main(String[] args) {
		Utility utility = new Utility();
		System.out.println("Enter a character : ");
		char a = utility.getCharValue();
		utility.checkVowelOrConsonant(a);
	}
}
