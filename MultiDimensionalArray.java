package com.java.training.programs;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		int matrix1[][]={{4,5,9},{3,4,9}};  
		int matrix2[][]={{2,7,9},{3,4,8}};  
		
		MatrixCalculation.matrixAddition(matrix1, matrix2);
		MatrixCalculation.matrixSubstraction(matrix1, matrix2);
		MatrixCalculation.matrixMultiplication(matrix1, matrix2);
		MatrixCalculation.matrixDivision(matrix1, matrix2);
	}

}
