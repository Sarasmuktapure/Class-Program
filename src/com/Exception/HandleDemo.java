package com.Exception;

public class HandleDemo {

	public static void main(String[] args)
	{

		System.out.println("Heloo");
        try
        {
        	int x=10;
        	int ans=x/0;
        	System.out.println(ans);
        }
        catch(ArithmeticException e)
        {
        	System.out.println(e);//gives which type of exception is
        	System.out.println(e.getMessage());//show only exception massage
        	e.printStackTrace();//gives type of exception, exception massage, and line number of exception
         }
        System.out.println("Welcome to java");
        System.out.println(10*4);
        
		
	}


}
