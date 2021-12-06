package com.polymorphism.methodoverloading;

public class MethodOverloadingExample 
{
	
	public void searchProduct(String strProduct)
	{
		System.out.println("Product : "+strProduct);
		
	}
	
	public void searchProduct(String strProduct,String strGender) {
	
		System.out.println("Product : "+strProduct+" Gender : "+strGender);

	}
	
	public void searchProduct(String strProduct,String strGender,String strBrand) {
		
		System.out.println("Product : "+strProduct+" Gender : "+strGender+" Brand : "+strBrand);
	}
	
	public void searchProduct(String strProduct,String strGender,String strBrand,String strColor) {
		
		System.out.println("Product : "+strProduct+" Gender : "+strGender+" Brand : "+strBrand+" Colour : "+strColor);
	}
	
	public void searchProduct(String strProduct,String strGender,String strBrand,String strColor,String strDiscountRange) {
		
		System.out.println("Product : "+strProduct+"| Gender : "+strGender+" | Brand : "+strBrand+" | Colour : "+strColor+" | Discount Range : "+strDiscountRange);

	}
	
	

}
