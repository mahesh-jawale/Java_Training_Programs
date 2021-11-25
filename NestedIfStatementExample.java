package com.java.training.programs;

import java.util.Scanner;

public class NestedIfStatementExample {

	public static void main(String[] args) {
		Scanner scannerSC=new Scanner(System.in);
		System.out.println("Enter gender Male Or Female");
		String strGender=scannerSC.nextLine();
		System.out.println("Enter your age");
		int intAge=scannerSC.nextInt();
				
		if(strGender.equalsIgnoreCase("Male"))
		{
			if(intAge>18)
			{
				System.out.println("You are eligible for voting");
			}
		}
		else if(strGender.equalsIgnoreCase("Female"))
		{
			if(intAge>18)
			{
				System.out.println("You are eligible for voting");
			}
		}
		else
		{
			System.out.println("Enter valid Gender");
		}
	}

}
