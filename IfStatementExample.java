package com.java.training.programs;

import java.util.Scanner;

public class IfStatementExample {

	public static void main(String[] args) {
		int intNum;
		Scanner scannerSC=new Scanner(System.in);
		System.out.println("Enter a number");
		intNum=scannerSC.nextInt();
		
		if(intNum%2==0)
		{
			System.out.println("Number is divisible by 2");
		}
		scannerSC.close();
	}

}
