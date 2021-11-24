package com.java.training.programs;

public class ArraysExample {
	
	
	public void printArray(int intArray[])
	{

		for(int inti=0;inti<intArray.length;inti++)//length is the property of array  
		{
			System.out.println(intArray[inti]);
		}
	}
	

	public static void main(String[] args) {
		
		ArraysExample objArraysExample=new ArraysExample();
		
		//Syntax to Declare an Array in Java(Declaration)
		//int[] intArray;
		//int []intArray;
		int intArray[];
		
		//Instantiation of an Array in Java(Instantiation)
		intArray=new int[5];
		
		//Initialization
		intArray[0]=10;
		intArray[1]=20;
		intArray[2]=30;
		intArray[3]=40;
		intArray[4]=50;
		
		System.out.println("printing intArray elements");
		for(int inti=0;inti<intArray.length;inti++)//length is the property of array  
		{
			System.out.println(intArray[inti]);
		}
		
		//Declaration, Instantiation and Initialization  
		String stringNames[]={"Mahesh","Ganesh","Ramesh","Suresh"};
		
		//For Loop
		System.out.println("For Loop");
		for(int inti=0;inti<stringNames.length;inti++)//length is the property of array  
		{
			System.out.println(stringNames[inti]);
		}
		
		//For each Loop
		System.out.println("For each Loop");
		for(String stringName:stringNames)
		{
			System.out.println(stringName);
		}
		
		//Passing array to printArray method
		System.out.println("printing intArray elements in printArray method");
		objArraysExample.printArray(intArray);
		
		//Passing Anonymous array to printArray method
		System.out.println("printing Anonymous array elements in printArray method");
		objArraysExample.printArray(new int[]{60,70,80,90,100});
		

	}

}
