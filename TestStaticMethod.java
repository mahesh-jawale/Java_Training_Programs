package com.programs;

public class TestStaticMethod 
{

	public static void main(String[] args)
	{
		Employee.change();//calling static change method  
		   
	    Employee obj1 = new Employee(1037,"Mahesh");  
	    Employee obj2 = new Employee(9999,"Suresh");  
		    //calling display method  
		    obj1.display();  
		    obj2.display();  
	     
	}  

}
