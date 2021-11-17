package com.programs;

public class Switch {

	public static void main(String[] args) {
		// program for mathematical operations on two operands
		int i=50,j=70;
		int option=4;
  		
		switch(option)
		{
			case 1:
				System.out.println("Addition of "+i+" and "+j+" is "+(i+j));
				break;
			case 2:
				System.out.println("Substraction of"+i+" and "+j+" is "+(i-j));
				break;
			case 3:
				System.out.println("Division of"+i+" and "+j+" is "+(i/j));
				break;
			case 4:
				System.out.println("Multiplication of"+i+" and "+j+" is "+(i*j));
				break;
			default:System.out.println("Invalid option");  
		}
		

	}

}
