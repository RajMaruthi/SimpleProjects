package com.practices;

public class BiggestOf3Numbers {

	public static void main(String[] args) 
	{
		
		int a=101;
		int b=20;
		int c=301;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is the biggest of 3 numbers");
			}
			else
			{
				System.out.println("C is the biggest of 3 numbers");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("B is the biggest of 3 numbers");
			}
			else
			{
				System.out.println("C is the biggest of 3 numbers");
			}
		}
		
		
	}

}
