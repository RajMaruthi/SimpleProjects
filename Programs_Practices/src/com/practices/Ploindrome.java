package com.practices;

public class Ploindrome {

	public static void main(String[] args)
	{
		
		int n=123;
		int temp=n;
		int rev=0;
		int rem=0;
		
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("The given number is polindrome");
		}
		else
		{
			System.out.println("The given number is not polindrome");
		}

	}

}
