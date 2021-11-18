package com.programs;

public class StaticVariableExample {

	int empID;
	String empName;
	static String companyName="Verve Square";//Static variable
	
	public void getData(int empID,String empName)
	{
		this.empID=empID;
		this.empName=empName;
	}
	
	public void display()
	{
		System.out.println("Employee ID "+empID+" | Employee Name  "+empName+" | Company Name "+companyName);
	}
	public static void main(String[] args) {
		
		StaticVariableExample obj1=new StaticVariableExample();
		StaticVariableExample obj2=new StaticVariableExample();
		
		obj1.getData(1037,"Mahesh");
		obj1.display();
		
		obj2.getData(9999,"Ramesh");
		obj2.display();
		
	}

}
