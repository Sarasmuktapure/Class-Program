package com.Exception;

class AgeValidateException extends Exception{
	public AgeValidateException()
	{
		System.out.println("Invalid age");
	}
	public AgeValidateException(String msg)
	{
		super(msg);
	}
	
}


public class CustomeDemo {
	public static void valid(int age) throws AgeValidateException{
		if(age<18)
		{
			throw new AgeValidateException("Age must greater than 18");
		}
		else
		{
			System.out.println("Age is valid");
		}
	}

	public static void main(String[] args) 
	{
		try
		{
			valid(20);
		}
		catch(AgeValidateException e)
		{
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
	}

}
