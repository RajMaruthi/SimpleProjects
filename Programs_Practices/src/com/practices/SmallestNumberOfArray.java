package com.practices;

public class SmallestNumberOfArray {

	public static void main(String[] args) 
	{
		int[] arr= {20,1,40,30,13};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("The smallest value of array is: "+min);

	}

}
