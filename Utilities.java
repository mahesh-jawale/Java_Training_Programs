package com.polymorphism.methodoverloading;

import java.util.Random;

public class Utilities {
	
	Random objRandom =new Random();
	public String generateProduct()
	{
		String strProducts[]={"Tshirts","Trousers","Jackets","Jeans","Shirts"};
		String strProduct=strProducts[objRandom.nextInt(strProducts.length)];
		return (strProduct);
	}
	
	public String generateGender()
	{
		String strGenders[]={"Male","Female"};
		String strGender=strGenders[objRandom.nextInt(strGenders.length)];
		return (strGender);
	}
	
	public String generateBrand()
	{
		String strBrands[]={"Roadsters","Puma","Adidas","Nike"};
		String strBrand=strBrands[objRandom.nextInt(strBrands.length)];
		return (strBrand);
	}
	
	public String generateColour()
	{
		String strColours[]={"Pink","Grey","Blue","Black","Red","Green","Orange"};
		String strColour=strColours[objRandom.nextInt(strColours.length)];
		return (strColour);
	}
	
	public String generateDiscountRange()
	{
		String strDiscounts[]={"10% and above","20% and above","30% and above","40% and above","50% and above"};
		String strDiscount=strDiscounts[objRandom.nextInt(strDiscounts.length)];
		return (strDiscount);
	}

}
