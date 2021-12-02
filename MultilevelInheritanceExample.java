package com.java.training.programs;

class EnggStudent
{
	String strEnggStudentName;
	int intEnggStudentYear;
	
	
}

class EnggStudentCollegeName extends EnggStudent
{
	String strEnggStudentCollegeName;

}

class EnggStudentDepartment extends EnggStudentCollegeName
{
	String strEnggStudentDepartment;
	
	
	
}


public class MultilevelInheritanceExample extends EnggStudentDepartment {

	 public MultilevelInheritanceExample(String strEnggStudentName,int intEnggStudentYear,String strEnggStudentCollegeName,String strEnggStudentDepartment)
	{
		this.strEnggStudentName=strEnggStudentName;
		this.intEnggStudentYear=intEnggStudentYear;
		this.strEnggStudentCollegeName=strEnggStudentCollegeName;
		this.strEnggStudentDepartment=strEnggStudentDepartment;
	}
	public void display()
	{
		System.out.println("EnggStudent Name : "+strEnggStudentName+""
				+ "\nEnggStudent Year  : "+intEnggStudentYear
				+"\nEnggStudentCollege Name  : "+strEnggStudentCollegeName
				+"\nEnggStudent Department  : "+strEnggStudentDepartment);
	}
	
	public static void main(String[] args) {
		
		MultilevelInheritanceExample objMultilevelInheritanceExample=new MultilevelInheritanceExample("Mahesh",1,"ABC Engineering College","CSE");
		objMultilevelInheritanceExample.display();
		
	}

}
