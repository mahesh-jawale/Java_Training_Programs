package com.programs;

//Multilevel Inheritance

class Addition
{
	void addition(int x,int y)
	{
		System.out.println("Addition of "+x+" and "+y+" is "+(x+y));
	}
	
}

class Substraction extends Addition
{
	void substraction(int x,int y)
	{
		System.out.println("Substraction of "+x+" and "+y+" is "+(x-y));
	}
}
public class InheritanceExample2 extends Substraction {

	void multiplication(int x,int y)
	{
		System.out.println("Multiplication of "+x+" and "+y+" is "+(x*y));
	}
	
	void division(int x,int y)
	{
		System.out.println("Division of "+x+" and "+y+" is "+(x/y));
	}
	public static void main(String[] args) {
		
			InheritanceExample2 obj=new InheritanceExample2();
			obj.addition(10,20);
			obj.substraction(50,20);
			obj.multiplication(10,20);
			obj.division(10,5);
		
	}

}
