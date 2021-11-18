package com.programs;

public class Employee {

	 int empID;  
     String empName;  
     static String companyName = "Verve Square";  
     //static method to change the value of static variable  
     static void change(){  
     companyName = "Verve Square Technologies";  
     }  
     //constructor to initialize the instance variable  
     Employee(int id, String name){  
     empID=id ;  
     empName=name ;  
     }  
     //method to display values  
     void display(){
    	 System.out.println("Employee ID "+empID+" Employee Name "+empName+" Company Name "+companyName);
     }

}
