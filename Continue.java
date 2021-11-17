package com.programs;

public class Continue {
	//Continue execution of program if array contains odd number
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,2,3,4,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println("Found odd number "+a[i]);
				continue;
			}
			System.out.println(a[i]);
		}
		
	}

}
