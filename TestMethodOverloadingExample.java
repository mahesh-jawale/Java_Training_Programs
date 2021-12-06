package com.polymorphism.methodoverloading;

public class TestMethodOverloadingExample extends BaseTest{

	public static void main(String[] args) {
		
		BaseTest objBaseTest=new BaseTest();
		Utilities objUtilities=new Utilities();
		MethodOverloadingExample objMethodOverloadingExample=new MethodOverloadingExample();
		
		objBaseTest.initializeWebEnvironment("https://www.myntra.com/");
		
		System.out.println("Searching Product");
		String strProduct=objUtilities.generateProduct();
		objMethodOverloadingExample.searchProduct(strProduct);
		
		System.out.println("============================================");
		
		System.out.println("Searching Product with Gender");
		String strGender=objUtilities.generateGender();
		objMethodOverloadingExample.searchProduct(strProduct,strGender);
		
		System.out.println("============================================");
		
		System.out.println("Searching Product with Gender and Brand");
		String strBrand=objUtilities.generateBrand();
		objMethodOverloadingExample.searchProduct(strProduct,strGender,strBrand);
		
	
		System.out.println("============================================");
		
		System.out.println("Searching Product with Gender,Brand and Colour");
		String strColour=objUtilities.generateColour();
		objMethodOverloadingExample.searchProduct(strProduct,strGender,strBrand,strColour);
		
		System.out.println("============================================");
		
		System.out.println("Searching Product with Gender,Brand,Colour and DiscountRange");
		String strDiscountRange=objUtilities.generateDiscountRange();
		objMethodOverloadingExample.searchProduct(strProduct,strGender,strBrand,strColour,strDiscountRange);
	
		

	}

}
