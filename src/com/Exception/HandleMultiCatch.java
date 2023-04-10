package com.Exception;

public class HandleMultiCatch {
	public static void main(String[] args)
	{
		try
		{
			int a[]= {2,4,5};
			System.out.println(a[6]/0);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);//universal catch block this is only responsible to catch the all exception 
			//if other catch block not define then its ok 
		}
		System.out.println("Hello java");
		

	}


}
