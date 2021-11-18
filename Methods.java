package com.programs;

public class Methods
{
	
	public void add(int m,int n)//instance method
	{
	System.out.println("Addition of "+m+" and "+n+" is "+(m+n));	
	}

	static void sub(int m,int n)//static method
	{
		System.out.println("Addition of "+m+" and "+n+" is "+(m-n));		
	}
	
	public static void main(String[] args) {
		
		Methods obj=new Methods(); 
		obj.add(30,45);	
		sub(30,20);
		

	}

}
