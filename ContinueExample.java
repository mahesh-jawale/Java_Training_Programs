package com.java.training.programs;

public class ContinueExample {

	public static void main(String[] args) {

		int intI;
		for (intI = 0; intI <= 10; intI++) {
			if (intI % 2 == 0) {
				continue;
			}
			System.out.println(intI);
		}

	}

}
