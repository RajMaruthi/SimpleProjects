package com.practices;

public class RangeOfPrimeNumber 
{

	public static void main(String[] args)
	{
		
		int n=10;
		int m=50;
		int flag=0;
		for(int i=n;i<m;i++) 
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=0;
					break;
				}
				else
				{
					flag=1;
				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}
		}

	}

}
