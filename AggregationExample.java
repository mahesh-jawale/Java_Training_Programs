package com.programs;

// Aggregation

class Address
{

	String city,state,country;
	
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	
}

class OfficeEmployee
{
	int empID;
	String empName;
	Address address;
	
	public OfficeEmployee(int empID,String empName,Address address)
	{
		this.empID=empID;
		this.empName=empName;
		this.address=address;
		
	}
	
	public void display()
	{
		System.out.println("Employee ID "+empID+"\nEmployee Name "+empName+"\nCity "+address.city+"\nState "+address.state+"\nCountry "+address.country);
		System.out.println("---------------------");
	}
	
	
	
}



public class AggregationExample {

	public static void main(String[] args)
	{
		
		Address obj1=new Address("Mumbai","Maharashtra","India");
		Address obj2=new Address("Jaipur","Rajasthan","India");
		
		OfficeEmployee emp1=new OfficeEmployee(1037, "Mahesh", obj1);
		OfficeEmployee emp2=new OfficeEmployee(9999, "Ganesh", obj2);
		
		emp1.display();
		emp2.display();
		
	

	}

}
