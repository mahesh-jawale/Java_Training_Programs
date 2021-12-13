package com.abstraction;

public class Addition extends Calculation 
{

	@Override
	public void calculation(int intFirstNum,int intSecondNum) {
		
		int intResult=intFirstNum+intSecondNum;
		System.out.println("Addition of "+intFirstNum+" and "+intSecondNum+" is "+intResult);
		
	}

	

}
