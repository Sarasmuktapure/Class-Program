package com.Exception;

public class UncheckedPropagate {
	static void m1()
	{
		try
		{
			throw new NullPointerException("My null value");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
	}
	static void n1()
	{
		m1();
	}
	static void p1()
	{
		n1();
	}
	

	public static void main(String[] args) {
		p1();
		System.out.println("Hello");

	}


}
