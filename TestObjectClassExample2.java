package com.java.training.programs;



class ObjectClassExample2
{

	String strStudentName;
	int intRollNum;
	
	public void initializeObject(String strStudentName,int intRollNum)
	{
		this.strStudentName=strStudentName;
		this.intRollNum=intRollNum;
	}

	public void display()
	{
		System.out.println("Student name : "+strStudentName+"\nStudent RollNumber  : "+intRollNum);
	}
}



public class TestObjectClassExample2 {

	public static void main(String[] args) {
	
		//Initializing object through method 
		ObjectClassExample2 objObjectClassExample2=new ObjectClassExample2();
		objObjectClassExample2.initializeObject("Mahesh",1037);	
		objObjectClassExample2.display();		
				
	}

}
