package com.java.training.programs;

class StudentInfo
{
	String strStudentName;
	int intStudentRollNum;
	
}

class Student1 extends StudentInfo
{
	public Student1()
	{
		strStudentName="mahesh";
		intStudentRollNum=1037;
	}
	
	public void display()
	{
		System.out.println("Student1 Name : "+strStudentName+"\nStuden1 RollNumber : "+intStudentRollNum);
	}
}

class Student2 extends StudentInfo
{
	public Student2()
	{
		strStudentName="Ganesh";
		intStudentRollNum=9999;
	}
	
	public void display()
	{
		System.out.println("Student2 Name : "+strStudentName+"\nStuden2 RollNumber : "+intStudentRollNum);
	}
}


public class HierarchicalInheritanceExample{

	public static void main(String[] args) {

		Student1 objStudent1=new Student1();
		objStudent1.display();
		
		Student2 objStudent2=new Student2();
		objStudent2.display();
		
		

	}

}
