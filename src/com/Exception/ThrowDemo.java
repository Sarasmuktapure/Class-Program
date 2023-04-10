package com.Exception;

public class ThrowDemo {
	public static void check(int n)
	{
		try
		{
		if(n<18)
		{
			throw new ArithmeticException("Invalid number");
		}
		else
		{
			System.out.println("Your age is right");
		}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
	public static void main(String[] args)
	{
		ThrowDemo.check(12);
		System.out.println("hello thorw done");
		
	}



}
