package com.practices;

public class LargestElementOfArray {

	public static void main(String[] args)
	{
		
		largestElementInArry();
	}
	
	static void largestElementInArry()
	{
		
		int a[]= {20,1,40,3,60,50};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
