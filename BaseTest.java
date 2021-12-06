package com.polymorphism.methodoverriding;

public class BaseTest {
	
	public void initializeWebEnvironment(String strURL)
	{
		System.out.println("Opening URL : "+strURL);
	}
	
	public void rechargeSuccessful()
	{
		System.out.println("\nPayment Successful");
		System.out.println("Your Mobile Number Is Recharged");
	}

}
