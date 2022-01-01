package com.practices;

public class StringPolindrome 
{

	public static void main(String[] args)
	{
		sortMethod("Bangalore");
	}
	
	static void sortMethod(String strName)
	{
		String strRev="";
		for(int i=strName.length()-1;i>=0;i--)
		{
			strRev+=strName.charAt(i);
		}
		System.out.println(strRev);
	}

	
	static void exceptionHandle()
	{
		
		
		
	}
	
}
