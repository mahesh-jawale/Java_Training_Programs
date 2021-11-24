package com.java.training.programs;

public class MatrixCalculation {
	static int intI,intJ;
	static int resultMatrix[][]=new int[2][3];
	
	public static void matrixAddition(int matrix1[][],int matrix2[][])
	{	
		System.out.println("Addition of matrices");
		
		for(intI=0;intI<2;intI++)
		{  
			for(intJ=0;intJ<3;intJ++)
			{  
			resultMatrix[intI][intJ]=matrix1[intI][intJ]+matrix2[intI][intJ];  
			System.out.print(resultMatrix[intI][intJ]+" ");  
			}  
			System.out.println("\n");
		}
		System.out.println("--------------------------------------------");
	}
		
	public static void matrixSubstraction(int matrix1[][],int matrix2[][])
	{	
		System.out.println("Substraction of matrices");
		
		for(intI=0;intI<2;intI++)
		{  
			for(intJ=0;intJ<3;intJ++)
			{  
			resultMatrix[intI][intJ]=matrix1[intI][intJ]-matrix2[intI][intJ];  
			System.out.print(resultMatrix[intI][intJ]+" ");  
			}  
			System.out.println("\n");
		}
		System.out.println("--------------------------------------------");
	}
			
	public static void matrixDivision(int matrix1[][],int matrix2[][])
	{	
		System.out.println("Division of matrices");
		
		for(intI=0;intI<2;intI++)
		{  
			for(intJ=0;intJ<3;intJ++)
			{  
			resultMatrix[intI][intJ]=matrix1[intI][intJ]/matrix2[intI][intJ];  
			System.out.print(resultMatrix[intI][intJ]+" ");  
			}  
			System.out.println("\n");
		}
		System.out.println("--------------------------------------------");
	}
	
	
	public static void matrixMultiplication(int matrix1[][],int matrix2[][])
	{	
		System.out.println("Multiplication of matrices");
		
		for(intI=0;intI<2;intI++)
		{  
			for(intJ=0;intJ<3;intJ++)
			{  
			resultMatrix[intI][intJ]=matrix1[intI][intJ]*matrix2[intI][intJ];  
			System.out.print(resultMatrix[intI][intJ]+" ");  
			}  
			System.out.println("\n");
		}
		System.out.println("--------------------------------------------");
	}




}
