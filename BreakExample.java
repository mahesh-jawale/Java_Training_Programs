package com.java.training.programs;

public class BreakExample {

	public static void main(String[] args) {

		String name = "mahesh";

		for (int intI = 0; intI < name.length(); intI++) {
			if (name.charAt(intI) == 'a' || name.charAt(intI) == 'e' || name.charAt(intI) == 'i'
					|| name.charAt(intI) == 'o' || name.charAt(intI) == 'u') {
				System.out.println("Given String contains vowel");
				break;
			}
		}
	}

}
