package com.practices;

public class PrintRangeOfOdd 
{
	public static void main(String[] args)
	{
		int n=10;
		int m=20;
		for(int i=n;i<=m;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
