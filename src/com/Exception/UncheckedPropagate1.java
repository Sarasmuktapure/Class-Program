package com.Exception;

public class UncheckedPropagate1 {
	static void m1()
	{
		throw new NullPointerException("My null value");
	}
	static void n1()
	{
		m1();
	}
	static void p1()
	{
		try
		{
			n1();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		p1();
	System.out.println("Hello");	
		
	}


}
