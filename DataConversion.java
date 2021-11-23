package com.java.training.programs;

public class DataConversion {

	public static void main(String[] args) {
		
		String stringVar;
		int intVar;
		long longVar;
		float floatVar;
		double doubleVar;
		
		//String to Integer
		stringVar="300";
		intVar=Integer.parseInt(stringVar);
		System.out.println("String to Integer "+intVar);
		
		//Integer to String
		intVar=500;
		stringVar=Integer.toString(intVar);
		System.out.println("Integer to String "+stringVar);
		
		//
		//Integer to String using String.valueOf();
		intVar=500;
		stringVar=String.valueOf(intVar);
		System.out.println("Integer to String using String.valueOf() "+stringVar);
		
		//String to Long
		stringVar="8888899999";
		longVar=Long.parseLong(stringVar);
		System.out.println("String to Long "+longVar);
		
		//Long to String
		longVar=8888899999l;
		stringVar=Long.toString(longVar);
		System.out.println("Long to String "+stringVar);
		
		//String to float
		stringVar="55.6";
		floatVar=Float.parseFloat(stringVar);
		System.out.println("String to float "+floatVar);
		
		//Float to String
		floatVar=54.6f;
		stringVar=Float.toString(floatVar);
		System.out.println("Float to string "+stringVar);
		
		//String to double
		stringVar="55.6";
		doubleVar=Double.parseDouble(stringVar);
		System.out.println("String to double "+doubleVar);
		
		//Double to String
		doubleVar=40.0d;
		stringVar=Double.toString(doubleVar);
		System.out.println("Double to String "+stringVar);
		
		//Int to Long
		intVar=20;
		longVar=intVar;
		System.out.println("Int to Long "+longVar);
		
		//Long to Int
		longVar=779999999l;
		intVar=(int)longVar;
		System.out.println("Long to Int "+intVar);
		
		
		//Long object to int by intValue() method of Long class
		Long l=new Long(40l);
		intVar=l.intValue();
		System.out.println("Long object to int "+intVar);
		
		//Int to Double
		intVar=70;
		doubleVar=intVar;
		System.out.println("Int to Double "+doubleVar);
		
		//Double to Int
		doubleVar=999999d;
		intVar=(int)doubleVar;
		System.out.println("Double to Int "+intVar);
		
		
		
		
		

	}

}
