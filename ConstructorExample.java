package com.programs;

public class ConstructorExample {

	int empID;
	String empName;
	
	public void display()
	{
		System.out.println("Employee ID "+empID+" | Employee Name "+empName);
	}
	
	public ConstructorExample(int n,String m){
		empID=n;
		empName=m;
	}
	public ConstructorExample() {
	
	}

	public static void main(String[] args) 
	{
		ConstructorExample obj1=new ConstructorExample();
		obj1.display();
		
		ConstructorExample obj2=new ConstructorExample(1037, "Mahesh");
		obj2.display();
		
	

	}

}
