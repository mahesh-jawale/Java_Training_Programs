package com.polymorphism.methodoverriding;

public class CricketPlans extends JioRecharge{

	
	@Override
	public void rechargeJioNumber() {
		System.out.println("----Cricket plans----");
		super.rechargeJioNumber();//use of Super keyword
		int intChoice=objRandom.nextInt(3)+1;
	
			switch(intChoice)
			{
			case 1:
				String str601Plan="601";
				System.out.println("You have selected : "+str601Plan+" plan (3 GB/Day,28 Days)");
				break;
				
			case 2:
				String str799Plan="799";
				System.out.println("You have selected : "+str799Plan+" plan (2 GB/Day,56 Days)");
				break;
				
			case 3:
				String str1066Plan="499";
				System.out.println("You have selected : "+str1066Plan+" plan (2 GB/Day,84 Days)");
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			
			}
		
	}
	
	
}
