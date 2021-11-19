package com.programs;

//Single Inheritance

class Calculation
{
	void addition(int x,int y)
	{
		System.out.println("Addition of "+x+" and "+y+" is "+(x+y));
	}
	
	void substraction(int x,int y)
	{
		System.out.println("Substraction of "+x+" and "+y+" is "+(x-y));
	}
}


class InheritanceExample extends Calculation{

	
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication of "+x+" and "+y+" is "+(x*y));
	}
	
	void division(int x,int y)
	{
		System.out.println("Division of "+x+" and "+y+" is "+(x/y));
	}
	public static void main(String[] args)
	{
		
		InheritanceExample obj=new InheritanceExample();
		obj.addition(10,20);
		obj.substraction(50,20);
		obj.multiplication(10,20);
		obj.division(10,5);
	}

}
