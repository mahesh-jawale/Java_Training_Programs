package com.polymorphism.methodoverriding;

public class PopularPlans extends JioRecharge {
	
	@Override
	public void rechargeJioNumber() {
		System.out.println("----Popular plans----");
		super.rechargeJioNumber();//use of Super keyword
		
		int intChoice=objRandom.nextInt(3)+1;
	
			switch(intChoice)
			{
			case 1:
				String str199Plan="199";
				System.out.println("You have selected : "+str199Plan+" plan (1.5 GB/Day,28 Days)");
				break;
				
			case 2:
				String str249Plan="249";
				System.out.println("You have selected : "+str249Plan+" plan (2 GB/Day,28 Days)");
				break;
				
			case 3:
				String str499Plan="499";
				System.out.println("You have selected : "+str499Plan+" plan (2 GB/Day,84 Days)");
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			
			}
		
	}
	
	
	
	
	
	
	
	
	
}
