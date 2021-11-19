package com.programs;

//Method Overloading

public class MethodOverloadingExample {
	
	
	public int addition(int x,int y)
	{
		return (x+y);
	}
	
	public int addition(int x,int y,int z)
	{
		return (x+y+z);	
	}
	
	public static void main(String[] args) {

	System.out.println("Addition of two numbers "+new MethodOverloadingExample().addition(20,40));
	System.out.println("Addition of three numbers "+new MethodOverloadingExample().addition(20,40,40));

	}

}
