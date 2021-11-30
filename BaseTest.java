package com.generic;

public class BaseTest {

	public void initializeWebEnvironment(String strURL)
	{
		System.out.println("Opening URL : "+strURL);
	}
	
	public void tearDown()
	{
		System.out.println("Closing Browser");
	}

}
