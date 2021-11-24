package com.java.training.programs;

public class Tables {
	static int intI,intJ;
	public static void mathematicalTables(int intTables[])
	{
		for(intI=0;intI<intTables.length;intI++) 
		{
			for(intJ=1;intJ<11;intJ++)
			{
				System.out.println(intTables[intI]*intJ);
			
			}
			System.out.println("\t");
		}
	}

}
