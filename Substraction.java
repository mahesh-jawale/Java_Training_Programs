package com.abstraction;

public class Substraction extends Calculation {

	@Override
	public void calculation(int intFirstNum, int intSecondNum) {
		int intResult=intFirstNum-intSecondNum;
		System.out.println("Substraction of "+intFirstNum+" and "+intSecondNum+" is "+intResult);
		
	}
	
	
	

}
