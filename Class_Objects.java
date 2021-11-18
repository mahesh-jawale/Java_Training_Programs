package com.programs;

public class Class_Objects {
	
	int empID;
	String empName;
	int empSalary;
	
	public void getData(int empID,String empName,int empSalary)
	{
		this.empID=empID;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public void display()
	{
		System.out.println("Employee ID "+empID+" | Employee Name "+empName+"  | Employee Salary "+empSalary);
	}
	
	
	
	

	public static void main(String[] args) {

		Class_Objects obj1=new Class_Objects();
		Class_Objects obj2=new Class_Objects();
		obj1.getData(1,"mahesh",50000);
		obj1.display();
		obj2.getData(2,"Anamika",20000);
		obj2.display();
		
		
		
				

	}

}
