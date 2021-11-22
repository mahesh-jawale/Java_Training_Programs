package com.programs;

public class VariablesExample {

	int instanceVar;//Instance variable
	void displayInstanceVar(int var)//Instance method
	{
		instanceVar=var;
		System.out.println("value of instanceVar is="+instanceVar);
	}
	
	static int staticVar=20;//Static variable
	
	static void displayStaticVar(int var1)//Static method
	{
		staticVar=var1;
		System.out.println("value of staticVar is="+staticVar);
	}
	public static void main(String[] args)
	{

		int localVar=30;//Local variable
		System.out.println("value of LocalVar is="+localVar);
		
		VariablesExample objVariablesExample1=new VariablesExample();
		objVariablesExample1.displayInstanceVar(10);
		
		VariablesExample objVariablesExample2=new VariablesExample();
		objVariablesExample2.displayInstanceVar(20);
		
		displayStaticVar(50);
		displayStaticVar(60);
	
	}

}
