package com.Oops;

public class ThisUse {
	int a;
	int b;
	
	public ThisUse()
	{
		this(20,10);
		System.out.println("Inside Default constructor");
	}
	
	public ThisUse(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Inside parameterized constructor");
		this.display();
	}
	
	
	 void display()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}
	
		
       public static void main(String[] args)
	{
		ThisUse t=new ThisUse();
		
		
		
		//t.display();
	
	}


}
