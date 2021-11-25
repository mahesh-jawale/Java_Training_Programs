package com.java.training.programs;

import java.util.Scanner;

public class IfElseIFLadderExample {
	
	public static void main(String[] args) {
		int intAge;
		Scanner scannerSC=new Scanner(System.in);
		System.out.println("Enter your age");
		intAge=scannerSC.nextInt();
		
		if(intAge>=0&&intAge<=1)
		{
			System.out.println("you are infant");
		}
		else if(intAge>=2&&intAge<=4)
		{
			System.out.println("You are toddler");
		}
		else if(intAge>=5&&intAge<=12)
		{
			System.out.println("You are child");
		}
		else if(intAge>=13&&intAge<=19)
		{
			System.out.println("You are teen");
		}
		else if(intAge>=20&&intAge<=39)
		{
			System.out.println("You are adult");
		}
		else if(intAge>=40&&intAge<=59)
		{
			System.out.println("You are middle age adult");
		}
		else if(intAge>=60)
		{
			System.out.println("You are Senior adult");
		}
		else
		{
			System.out.println("Invalid age");
		}
		
		
		scannerSC.close();
	}
	
}


