package com.java.training.programs;

import java.util.Scanner;

public class TestLoopStatementExample {

	public static void main(String[] args) {

		int intChoice;
		Scanner scannerSC = new Scanner(System.in);

		System.out.println("Enter your choice");
		System.out.println("1.To check whether number is Armstrong or not");
		System.out.println("2.To check whether number is Prime or not");
		System.out.println("3.To print fibonaci series");

		intChoice = scannerSC.nextInt();

		switch (intChoice) {

		case 1:
			LoopStatementExample.armstrongNumber();
			break;

		case 2:
			LoopStatementExample.primeNumber();
			break;

		case 3:
			LoopStatementExample.fibonacciSeries();
			break;
		default:
			System.out.println("Invalid Choice");
			break;

		}

	}

}
