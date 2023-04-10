package com.Exception;

public class TryFinally {
	public static void main(String[] args) {
		try
		{
			int x=10;
			int ans=x/0;
			System.out.println(ans);
		}
		finally
		{
			System.out.println("Finally block");
		}
		//finally block executes always whether exception occurred or not 
		/*catch(Exception e)
		{
			System.out.println(e);
		}*/

		System.out.println("Hello");
	}

}
