package com.java.training.programs;

public class ParameterLessConstructor {

	int intEmpNum;
	String strEmpName;
	
	public ParameterLessConstructor() {
		intEmpNum=1037;
		strEmpName="Mahesh";		
	}
		
	public static void main(String[] args) {
		ParameterLessConstructor objParameterLessConstructor=new ParameterLessConstructor();
		System.out.println("Emp ID : "+objParameterLessConstructor.intEmpNum);
		System.out.println("Emp Name : "+objParameterLessConstructor.strEmpName);
	}

}
