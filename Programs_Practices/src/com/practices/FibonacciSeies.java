package com.practices;

public class FibonacciSeies 
{

	public static void main(String[] args)
	{
		int num=8;
		int n=0;
		int n1=1;
		int res=0;
		System.out.println(n+"\n"+n1);
		for(int i=2;i<=num;i++)
		{
			res=n+n1;
			n=n1;
			n1=res;
			
			System.out.println(res);
		}

	}

}
