package com.java.training.programs;

import java.util.Scanner;

public class Years {
	static Scanner sc = new Scanner(System.in);
	static float intMarks;
	static float percentage;

	public static void firstYearPercentage() {

		System.out.println("Enter your marks out of 650");
		intMarks = sc.nextFloat();
		float intTotalMarks = 650;
		if (intMarks > 0 && intMarks <= intTotalMarks) {
			percentage = (intMarks / intTotalMarks) * 100;
			System.out.println("Your first year percentage is " + percentage);
		} else {
			System.out.println("invalid marks");
		}
	}

	public static void secondYearPercentage() {

		System.out.println("Enter your marks out of 750");
		intMarks = sc.nextFloat();
		float intTotalMarks = 750;
		if (intMarks > 0 && intMarks <= intTotalMarks) {
			percentage = (intMarks / intTotalMarks) * 100;
			System.out.println("Your first year percentage is " + percentage);
		} else {
			System.out.println("invalid marks");
		}
	}

	public static void thirdYearPercentage() {

		System.out.println("Enter your marks out of 850");
		intMarks = sc.nextFloat();
		float intTotalMarks = 850;
		if (intMarks > 0 && intMarks <= intTotalMarks) {
			percentage = (intMarks / intTotalMarks) * 100;
			System.out.println("Your first year percentage is " + percentage);
		} else {
			System.out.println("invalid marks");
		}
	}

	public static void fourthYearPercentage() {

		System.out.println("Enter your marks out of 950");
		intMarks = sc.nextFloat();
		float intTotalMarks = 950;
		if (intMarks > 0 && intMarks <= intTotalMarks) {
			percentage = (intMarks / intTotalMarks) * 100;
			System.out.println("Your first year percentage is " + percentage);
		} else {
			System.out.println("invalid marks");
		}
	}

}
