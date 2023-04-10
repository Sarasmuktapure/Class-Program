package com.Oops;

public class StaticDemo1 {
	static int a=15;
	int b=9;
	
	static void Addition()
	{
		StaticDemo1 d1=new StaticDemo1();
		System.out.println("Addition is="+(a+d1.b));
		d1.Multiplication();
	}
	public void Multiplication()
	{
		System.out.println("Multiplication is="+(a*b));
	}
	

	public static void main(String[] args)
	
	{
		StaticDemo1.Addition();
		
		System.out.println("Main Method");

	}


}
