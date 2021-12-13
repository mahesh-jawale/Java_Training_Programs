package com.javainterface;

public class Student1 implements StudentInfo {

	int intRollNum=10;
	String strStudentName="Mahesh";
	
	@Override
	public void getStudentInfo() {
		System.out.println("Student College Name : "+strCollegeName);
		System.out.println("Student Roll number : "+intRollNum);
		System.out.println("Student Name : "+strStudentName);
	}

}
