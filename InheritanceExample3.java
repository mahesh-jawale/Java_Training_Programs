package com.programs;

//Hierarchical Inheritance

class CorporateEmployee
{
	static String companyName="Verve Square Technologies";
}

class CorporateEmployee1 extends CorporateEmployee
{
	int empID;
	String empName;
	
	void getData(int x,String y)
	{
		empID=x;
		empName=y;
		System.out.println("Corporate Employee 1");
		System.out.println("Employee ID "+empID+"\nEmployee Name "+empName+"\nCompany Name "+companyName);
		System.out.println("---------------------");
	}
}

class CorporateEmployee2 extends CorporateEmployee
{
	int empID;
	String empName;
	
	void getData(int x,String y)
	{
		empID=x;
		empName=y;
		System.out.println("Corporate Employee 2");
		System.out.println("Employee ID "+empID+"\nEmployee Name "+empName+"\nCompany Name "+companyName);
		System.out.println("---------------------");
	}
}
public class InheritanceExample3 {

	public static void main(String[] args) {
		CorporateEmployee1 obj1=new CorporateEmployee1();
		obj1.getData(1037, "Mahesh");
		
		CorporateEmployee2 obj2=new CorporateEmployee2();
		obj2.getData(9999, "Ganesh");
		
		

	}

}
