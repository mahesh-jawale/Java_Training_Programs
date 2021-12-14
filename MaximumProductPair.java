package com.project;

public class MaximumProductPair {

	public void maxProduct(int intArr[], int intLength) {
		if (intLength < 2) {
			return;
		}

		int firstNum = intArr[0], secondNum = intArr[1];
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {

				if (intArr[i] * intArr[j] > firstNum * secondNum) {
					firstNum = intArr[i];
					secondNum = intArr[j];
				}

			}

		}

		System.out.println("max product pair is :" + firstNum + " and " + secondNum);

	}

	public static void main(String[] args) {

		int intArr[] = { 1, 4, 3, 6, 7, 0 };
		int intLength = intArr.length;
		MaximumProductPair objMaximumProductPair = new MaximumProductPair();
		objMaximumProductPair.maxProduct(intArr, intLength);

	}

}
