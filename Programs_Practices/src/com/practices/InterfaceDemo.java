package com.practices;
interface Actor
{
	void actor();
}
interface Producer
{
	void producer();
}
interface Director
{
	void director();
}

class Darshan implements Actor,Producer
{
	public void actor()
	{
		System.out.println("Darshan is a actor");
	}
	
	public void producer()
	{
		System.out.println("Darshan is also a producer");
	}
}

class Upendra implements Actor,Producer,Director
{
	public void actor()
	{
		System.out.println("Upendra is actor");
	}
	public void producer()
	{
		System.out.println("Upendra is a producer");
	}
	public void director()
	{
		System.out.println("Upendra is a director");
	}
}


public class InterfaceDemo 
{

	public static void main(String[] args)
	{
		
		Darshan d=new Darshan();
		d.actor();
		d.producer();
		
		System.out.println("-------------------------------------");
		
		Upendra u=new Upendra();
		u.actor();
		u.producer();
		u.director();
	}

}
