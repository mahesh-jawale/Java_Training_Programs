package com.programs;

class Train
{
	
	public String trainName()
	{
		
		return "trainName";
	}
	
}

class Gitanjali extends Train
{
	public String trainName()
	{
		return "Gitanjali";
	}
	
}

class Rajdhani extends Train
{
	public String trainName()
	{
		return "Rajdhani";
	}
	
}

class GaribRath extends Train
{
	public String trainName()
	{
		return "GaribRath";
	}
	
}


public class MethodOverridingExample 
{

	public static void main(String[] args) {
		Gitanjali obj1=new Gitanjali();
		Rajdhani obj2=new Rajdhani();
		GaribRath obj3=new GaribRath();
		
		System.out.println(obj1.trainName());
		System.out.println(obj2.trainName());
		System.out.println(obj3.trainName());
	

	}

}
