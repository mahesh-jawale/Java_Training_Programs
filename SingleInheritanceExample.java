package com.java.training.programs;

class Student
{
	String strStudentName;
	int intStudentRollNum;
		
}


public class SingleInheritanceExample extends Student {

	String strGender;
	int intStandard;
	
	
	public static void main(String[] args) {

		SingleInheritanceExample objSingleInheritanceExample=new SingleInheritanceExample();
		objSingleInheritanceExample.strStudentName="mahesh";
		objSingleInheritanceExample.intStudentRollNum=1037;
		objSingleInheritanceExample.strGender="Male";
		objSingleInheritanceExample.intStandard=12;
		
		System.out.println("Student name : "+objSingleInheritanceExample.strStudentName+""
							+ "\nStudent RollNumber  : "+objSingleInheritanceExample.intStudentRollNum
							+"\nStudent Gender  : "+objSingleInheritanceExample.strGender
							+"\nStandard  : "+objSingleInheritanceExample.intStandard);
		
	}

}
