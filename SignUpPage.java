package com.fb.signup.pagefactory;

import java.util.Scanner;

public class SignUpPage {

	static Scanner scannerSC=new Scanner(System.in);
	
	public static void verifySignUpPageIsDisplayed()
	{
		System.out.println("Sinup Page Is Displayed");
	}
	
	
	public static void verifyFirstNameTextBox()
	{
		String firstName;
		System.out.println("Enter First Name");
		firstName=scannerSC.nextLine();
		System.out.println("First Name is "+firstName);
	}
	
	public static void verifySecondNameTextBox()
	{
		String secondName;
		System.out.println("Enter Second Name");
		secondName=scannerSC.nextLine();
		System.out.println("Second Name is "+secondName);
	}
	
	public static void verifyMobileNumOrEmailAdd()
	{
		String strMobileNumOrEmailAdd;
		System.out.println("Enter Mobile Number or Email Address");
		strMobileNumOrEmailAdd=scannerSC.nextLine();
		System.out.println(strMobileNumOrEmailAdd);
	
	}
	
	public static void verifyPassword()
	{
		String strPassword;
		System.out.println("Enter password");
		strPassword=scannerSC.nextLine();
		if(strPassword.length()>6)
		{
			System.out.println("Valid password");
		}
		else
		{
			System.out.println("Invalid password");
		}
	}
	
	public static void verifyDOB() {
		String strDate, strMonth, strYear, strDOB;
		System.out.println("Enter Date");
		strDate = scannerSC.nextLine();
		System.out.println("Enter Month");
		strMonth = scannerSC.nextLine();
		System.out.println("Enter Year");
		strYear = scannerSC.nextLine();
		strDOB = String.join("/", strDate, strMonth, strYear);
		System.out.println(strDOB);

	}
	
	public static void verifyGender()
	{
		int intGender;
		System.out.println("Enter 1 for male and 2 for female");
		intGender=scannerSC.nextInt();
		if(intGender==1)
		{
			System.out.println("Male");
		}
		else
		{
			System.out.println("Female");
		}
	}
	
	public static void verifySignUpButton()
	{
		System.out.println("You are successfully signed up");
	}
	
}
