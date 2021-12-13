package com.javainterface;

public class Student2 implements StudentInfo{
	
	int intRollNum=20;
	String strStudentName="Ganesh";
	
	@Override
	public void getStudentInfo() {
		System.out.println("Student College Name : "+strCollegeName);
		System.out.println("Student Roll number : "+intRollNum);
		System.out.println("Student Name : "+strStudentName);
	}

}
