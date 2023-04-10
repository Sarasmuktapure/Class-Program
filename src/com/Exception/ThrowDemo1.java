package com.Exception;

public class ThrowDemo1 {
	public static void check(int n)
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
	
	
	

	public static void main(String[] args) 
	{
		try
		{
			ThrowDemo1.check(20);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Hello throw done");
	

	}

}
