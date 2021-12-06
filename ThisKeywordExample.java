package com.thiskeyword;

public class ThisKeywordExample {

	String strFlavour;
	
	
	
	public void setFlavourAndGetPrice(String strFlavour)
	{
		this.strFlavour=strFlavour;
		
		switch(strFlavour)
		{
		case "Vanila":
			System.out.println(strFlavour+" flavour price is 25rs.");
			break;
			
		case "Strawberry":
			System.out.println(strFlavour+" flavour price is 30rs.");
			break;
			
		case "Chocolate":
			System.out.println(strFlavour+" flavour price is 20rs.");
			break;
			
		case "Blackberry":
			System.out.println(strFlavour+" flavour price is 15rs.");
			break;
			
		case "Blueberry":
			System.out.println(strFlavour+" flavour price is 40rs.");
			break;
			
		default:
			System.out.println("Invalid Choice");
			break;
		
	}
	
	

		
		
	}
	
	
	
	
	

}
