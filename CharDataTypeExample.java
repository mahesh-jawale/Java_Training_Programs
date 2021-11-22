package com.programs;

import java.util.Arrays;

public class CharDataTypeExample {


	
	public static void main(String[] args) {
		char a=65;
		char b='G';
		System.out.println(a);//prints A beacuse ASCII code of A is 65
		System.out.println(b);
		a++;//Increments ASCII code 65 by 1
		System.out.println(a);//prints B beacuse ASCII code of B is 66
		
		String name="Mahesh";
		char arrayName[]=name.toCharArray();// conversion into character array
        System.out.println("Original String was: " + name);
        System.out.println("Characters are: " + Arrays.toString(arrayName));
	}

}
