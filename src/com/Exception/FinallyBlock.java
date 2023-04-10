package com.Exception;

public class FinallyBlock {
	public static void main(String[] args)
	{
		try
		{
			System.out.println("hiiii");
			int x=10/0;
			System.out.println(x);
		}
		catch(Exception n)
		{
			System.out.println(n);
		}
		finally
		{
			System.out.println("I am finally block");//this block always executes whether exception handle or not
		    //in this block we have to write important code
		}
		System.out.println("Welcome");
		
	}


}
