package com.java.training.programs;

public class DefaultConstructorExample {

	int intEmpNum;
	String strEmpName;
	
	public void display()
	{
		System.out.println("Employee Number : "+intEmpNum);
		System.out.println("Employee Name : "+strEmpName);
	}
	
	public static void main(String[] args) {
	
		DefaultConstructorExample objDefaultConstructorExample=new DefaultConstructorExample();
		objDefaultConstructorExample.display();
	}

}
