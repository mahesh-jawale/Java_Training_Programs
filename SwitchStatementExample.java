package com.java.training.programs;

import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {

		int intOption;
		System.out.println("Enter the year");
		System.out.println("1.First year");
		System.out.println("2.Second year");
		System.out.println("3.Third year");
		System.out.println("4.Fourth year");

		Scanner scannerSC = new Scanner(System.in);
		intOption = scannerSC.nextInt();

		switch (intOption) {
		case 1:
			Years.firstYearPercentage();
			break;
		case 2:
			Years.secondYearPercentage();
			break;
		case 3:
			Years.thirdYearPercentage();
			break;
		case 4:
			Years.fourthYearPercentage();
			break;
		default:
			System.out.println("Invalid choice");
			break;
			
		}

	}

}

