package com.polymorphism.methodoverriding;

import java.util.Random;

public class JioRecharge {
	
	Random objRandom=new Random();
	public void rechargeJioNumber()
	{
		String strMobNumStartingDigits[]={"9","7","8","6"};
		String strMobNumStartingDigit=strMobNumStartingDigits[objRandom.nextInt(strMobNumStartingDigits.length)];
		int length=9;
		String strMobNumDigits="0123456789";
		String randomNumber="";
		for(int index=0;index<length;index++){
		int rnum= (int)((Math.random()*strMobNumDigits.length()));
		randomNumber +=strMobNumDigits.substring(rnum, rnum+1);
		}
		System.out.println("Mobile Number : "+strMobNumStartingDigit+randomNumber);
	}

}
