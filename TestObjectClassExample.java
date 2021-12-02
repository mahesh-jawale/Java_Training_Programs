package com.java.training.programs;

class ObjectClassExample
{

	String strStudentName;
	int intRollNum;

}

public class TestObjectClassExample {
	public static void main(String[] args) {
		
		//Initializing object through reference 
		ObjectClassExample objObjectClassExample=new ObjectClassExample();
		objObjectClassExample.strStudentName="Mahesh";
		objObjectClassExample.intRollNum=1037;
		
		System.out.println("Student name : "+objObjectClassExample.strStudentName+"\nStudent RollNumber  : "+objObjectClassExample.intRollNum);
		
		
		
		
	}

}


