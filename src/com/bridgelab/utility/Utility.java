package com.bridgelab.utility;

import java.util.Scanner;
import java.io.*;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {
		int a = scanner.nextInt();

		// a = a + 2;
		return a;
		// return scanner.nextInt() + 2;
	}

	public void getIntValue1(int a) {
		int b = a;
	}

	public char getCharValue() {
		char c;
		
	}

	public void getHarmonicNumber(int number) {
		double HarmonicNumber = 0;
		for (double i = 1; i < number; i++) {
			HarmonicNumber = HarmonicNumber + (1 / i);
		}
		System.out.println("n'th Harmonic Number of " + number + ":" + HarmonicNumber);
	}

	public void fliCoinPercent(int NumberOfFlips) {
		System.out.println("fliCoinPercent");
		double head = 0, headPercent;
		for (int i = 0; i < NumberOfFlips; i++) {
			double side = Math.random();
			if (side > 0.5) {
				head++;
			}
		}
		headPercent = head * 100 / NumberOfFlips;
		System.out.println("Percentage of Head= " + headPercent);
		System.out.println("Percentage of Tail=" + (100 - headPercent));
	}

	public void checkLeapYear(int year) {
		if (year % 400 == 0 && year % 4 == 0 || year % 100 != 0) {
			System.out.println("This is leap year  : " + year);
		} else {
			System.out.println("This is not leap year  : " + year);
		}
	}

	public void powerOfTwo(int power) {
		if (power > 0 && power < 40) {
			int powTwo = (int) Math.pow(2, power);
			System.out.format("Power %d of 2 : %d\n", power, powTwo);
			for (int i = 1; i <= 10; i++) {
				System.out.format("%d X %d : %d \n", powTwo, i, (powTwo * i));
			}
		} else {
			System.out.println("Enter power in between 0 to 31 ");
		}

	}

	public void factorCheck(int factorNumber1) {
// Print the number of 2s that divide n
		while (factorNumber1 % 2 == 0) {
			System.out.print(2 + " ");
			factorNumber1 /= 2;
		}

// n must be odd at this point.  So we can
// skip one element (Note i = i +2)
		for (int i = 3; i <= Math.sqrt(factorNumber1); i += 2) {
			// While i divides n, print i and divide n
			while (factorNumber1 % i == 0) {
				System.out.print(i + " ");
				factorNumber1 /= i;
			}
		}
// This condition is to handle the case when
// n is a prime number greater than 2
		if (factorNumber1 > 2)
			System.out.print(factorNumber1);
	}

	public void quotientAndRemainder(int dividend, int divisor) {
		float quotient, remainder;
		System.out.println("Quotient is : " + (dividend / divisor));
		System.out.println("Remainder is : " + (dividend % divisor));
	}

	public void swapNumbers(int a, int b) {
		System.out.format("Before Swap first number %d and second number %d \n", a, b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.format("After Swap first number %d and second number %d", a, b);
	}

	public void checkOddOrEven(int a) {
		if (a % 2 == 0) {
			System.out.format("Entered number %d is Even", a);
		} else {
			System.out.format("Entered number %d is Odd", a);
		}
	}

	public void checkVowelOrConsonant(char a) {
		if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
				|| a == 'U') {
			System.out.println("It is Vowel");
		} else {
			System.out.println("It is Consonant");
		}
	}

	public void findLargestofThree(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.format("Largest Number %d ", a);
		} else if (b > a && b > c) {
			System.out.format("Largest Number %d ", b);
		} else {
			System.out.format("Largest Number %d ", c);
		}
	}

	public Integer[][] getIntTwoDArray(int m, int n) {
		Integer[][] array = new Integer[m][n];
		System.out.println("Enter " + (m * n) + " Integer Values :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = getIntValue();
			}
		}
		return array;
	}

	public <t> void printArray(t[][] array, int m, int n) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				writer.write("arr[" + i + "][" + j + "]=" + array[i][j]);
				writer.flush();
			}
			System.out.println();
		}
	}

	public Double[][] getDoubleTwoDArray(int m, int n) {
		Double[][] array1 = new Double[m][n];
		System.out.println("Enter " + (m * n) + " Double Values :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array1[i][j] = scanner.nextDouble();
			}
		}
		return array1;
	}

	public Boolean[][] getBooleanTwoDArray(int m, int n) {
		Boolean[][] array2 = new Boolean[m][n];
		System.out.println("Enter " + (m * n) + " Boolean Values :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array2[i][j] = scanner.nextBoolean();
			}
		}
		return array2;
	}

	public void printArrayBoolean(Boolean[][] array2, int m, int n) {
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				writer.write("arr[" + i + "][" + j + "]=" + array2[i][j]);
				writer.flush();
			}
			System.out.println();
		}
	}

	public void getEuclideanDistance(int x, int y) {
		float distance;
		distance = (float) Math.sqrt((x * x) + (y * y));
		System.out.println("Euclidean Distance : " + distance);
	}

	public void quadratic(int a, int b, int c) {
		float root1, root2;
		int delta;
		delta = ((b * b) - (4 * a * c));
		root1 = (float) (-b + ((Math.sqrt(delta)) / (2 * a)));
		root2 = (float) (-b - ((Math.sqrt(delta)) / (2 * a)));
		System.out.format("Root 1 %f ,Root 2 %f , Delta %d ", root1, root2, delta);
	}

	public void WindChill(float t, float v) {
		double w;
		w = (float) (35.74) + (0.6215 * t) + ((0.4275 * t) - (35.75)) * (Math.pow(v, 0.16));
		System.out.println("Wind Chill : " + w);
	}

	public Integer[] getSumOfZero(int m) {
		Integer[] array = new Integer[m];
		for (int i = 0; i < m; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

	public void printOutput(Integer[] array, int m) {
		int sum, count = 0;

		for (int i = 0; i < m; i++) {
			for (int j = i + 1; j < m; j++) {
				for (int k = j + 1; k < m; k++) {
					sum = array[i] + array[j] + array[k];
					if (sum == 0) {
						count++;
						System.out.println(array[i] + "," + array[j] + "," + array[k] + "=" + 0);
					}
				}
			}
		}
		System.out.println("Count: " + count);
	}
}
