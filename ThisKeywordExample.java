package com.programs;

public class ThisKeywordExample {
	
	int studentID;
	String studentName;
	
	void getData(int studentID,String studentName)
	{
		this.studentID=studentID;
		this.studentName=studentName;
	}
	
	void thisMethod(int i)
	{
	System.out.println("this method"+i);	
	}
	
	void display(int i)
	{
		System.out.println("Student ID "+studentID+" | Student Name "+studentName);
		this.thisMethod(i);
	}

	public static void main(String[] args) 
	{
		  
			ThisKeywordExample Obj1=new ThisKeywordExample();  
			  Obj1.getData(1037,"Mahesh");
			  Obj1.display(30);
			  
			  
			  ThisKeywordExample Obj2=new ThisKeywordExample();  
			  Obj2.getData(1039,"rajesh");
			  Obj2.display(60);
	}

}
