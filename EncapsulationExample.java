package com.programs;


class Student
{
	private int rollNum;
	private String studentName;
	private int standard;
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
}

public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student();
		obj1.setRollNum(1);
		obj1.setStandard(5);
		obj1.setStudentName("Mahesh");
		
		System.out.println("RollNum "+obj1.getRollNum()+" \nStandard "+obj1.getStandard()+"\nStudentName "+obj1.getStudentName());

	}

}
