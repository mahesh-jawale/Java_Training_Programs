package com.java.training.programs;

import java.util.Scanner;

public class LoopStatementExample {
	static Scanner scannerSC = new Scanner(System.in);

	public static void armstrongNumber() {
		int intRemainder, intNumber, intTemp, intSum = 0;
		System.out.println("Armstrong Number Program");
		System.out.println("Enter a number=");
		intNumber = scannerSC.nextInt();
		intTemp = intNumber;

		do {
			intRemainder = intNumber % 10;
			intSum = intSum + intRemainder * intRemainder * intRemainder;
			intNumber = intNumber / 10;
		} while (intNumber > 0);

		if (intSum == intTemp) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
	}

	public static void fibonacciSeries() {

		int intNumber1 = 0, intNumber2 = 1, intNumber3, intI, intCount;
		System.out.println("Enter count of fibonacci series");
		intCount = scannerSC.nextInt();
		
		System.out.println("Fibonacci Series Program");
		System.out.print(intNumber1 + " " + intNumber2);

		intI = 2;

		while (intI < intCount)
		{
			intNumber3 = intNumber1 + intNumber2;
			System.out.print(" " + intNumber3);
			intNumber1 = intNumber2;
			intNumber2 = intNumber3;
			intI++;
		}

	}

	public static void primeNumber() {
		int intNumber, intI = 2;
		System.out.println("Prime Number Program");
		System.err.println("Enter a number=");
		intNumber = scannerSC.nextInt();
		for (intI = 2; intI < intNumber; intI++) {
			if (intNumber % intI == 0) {
				break;
			}
		}

		if (intI == intNumber) {
			System.out.println("Number is Prime");

		} else {
			System.out.println("Number is not Prime");
		}

	}

}
