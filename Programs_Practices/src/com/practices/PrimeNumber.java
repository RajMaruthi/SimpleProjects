package com.practices;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		
		int n=27;
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("The given number is not prime");
		}
		else
		{
			System.out.println("The given number is prime");
		}
	}

}
