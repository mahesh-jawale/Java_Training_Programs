package com.variables;

public class Variables
{
	int j;//Instance Variable
	public static int k;//Static Variable
	
	public static void main(String[] args)
	{
		int i=10;//Local Variable
		Variables obj=new Variables();
		Variables obj1=new Variables();
		obj.j=20;
		obj1.j=40;
		k=60;
		System.out.println("Local Variable i="+i);
		System.out.println("Instance variable j="+obj.j);
		System.out.println("Instance variable j="+obj1.j);
		System.out.println("Static variable k="+k);
		

	}

}
