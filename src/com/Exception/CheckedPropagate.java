package com.Exception;

import java.io.IOException;

public class CheckedPropagate {
	static void m1()
	{
		try
		{
			throw new IOException("Device Error");
		}
		catch(Exception e)
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
	

	public static void main(String[] args) 
	{
		p1();
		System.out.println("hello");

	}


}
