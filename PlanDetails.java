package com.inheritance;

public class PlanDetails extends MobileNumber{
	

	
	public void selectPlan()
	{
		
		int intChoice=objRandom.nextInt(3)+1;
		switch(intChoice)
		{
		case 1:
			String str199Plan="199";
			System.out.println("You have selected : "+str199Plan+" plan ");
			break;
			
		case 2:
			String str249Plan="249";
			System.out.println("You have selected : "+str249Plan+" plan ");
			break;
			
		case 3:
			String str499Plan="499";
			System.out.println("You have selected : "+str499Plan+" plan ");
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
		
		}
	}

}
