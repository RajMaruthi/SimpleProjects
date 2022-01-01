package com.practices;

public class AramStrongNumber 
{

	public static void main(String[] args)
	{
		
		int n=372;
		int temp=n;
		int rem=0;
		int res=0;
		while(n>0)
		{
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		
		if(temp==res)
		{
			System.out.println("The given number is anagram");
		}
		else
		{
			System.out.println("The given number is not a anagram");
		}

	}

}
