package com.inheritance;

public class CardDetails extends PlanDetails{
	
	public void enterCardDetails()
	{
	
		int index;
		int length=16;
		String strCardNumDigits="0123456789";
		String randomCardNumber="";
		for(index=0;index<length;index++){
		
		int rnum= (int)((Math.random()*strCardNumDigits.length()));
		randomCardNumber +=strCardNumDigits.substring(rnum, rnum+1);
		}
		System.out.print("Card Number :");
		for(index=0;index<randomCardNumber.length();index++)
		{
			if(index%4==0)
			System.out.print(" ");
			
			System.out.print(randomCardNumber.charAt(index));
		}
		
		int intCVV[]=new int[3];
		System.out.print("\nCVV : ");
		for(index=0;index<3;index++)
		{
			intCVV[index]=objRandom.nextInt(10);
			System.out.print(intCVV[index]);
		}
	
	}

}
