package com.practices;

public class SearchElement {

	public static void main(String[] args)
	{
		int[] arr= {1,2,50,3,40,12};
		int key=51;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("The key element is found");
		}
		else
		{
			System.out.println("The key element is not found");
		}

	}

}
