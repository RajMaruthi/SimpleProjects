package com.practices;
abstract class Person
{
	Person()
	{
		System.out.println("Default constructor");
	}
	abstract void displayName();
	abstract void displayAge();
	
	int num=10;
	
	void displayGender()
	{
		System.out.println("Male");
	}
	
	static void displayBloodGroup()
	{
		System.out.println("O+ve");
	}
	
	abstract void displayCourse();
	
}

abstract class Person1 extends Person
{
	void displayName()
	{
		System.out.println("Maruthiraja");
	}
	void displayAge()
	{
		System.out.println("30");
	}
}

class Person2 extends Person1
{
	void displayCourse()
	{
		System.out.println("MCA");
		System.out.println(num);
	}
}



public class AbstractionDemo 
{

	public static void main(String[] args)
	{
		
		Person p=new Person2();
		p.displayAge();
		p.displayGender();
		p.displayName();
		Person.displayBloodGroup();
		
		System.out.println("------------------------------------------------");
		
		Person1 p1=new Person2();
		p1.displayAge();
		p1.displayGender();
		p1.displayName();
		Person1.displayBloodGroup();
		
		System.out.println("------------------------------------------------");
		
		Person2 p2=new Person2();
		p2.displayAge();
		p2.displayCourse();
		p2.displayGender();
		p2.displayName();
		Person2.displayBloodGroup();
	
	}

}
