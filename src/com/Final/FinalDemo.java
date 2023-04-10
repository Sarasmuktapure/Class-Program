package com.Final;

public class FinalDemo {
final int x=7;
	
	void display()
	{
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		FinalDemo d=new FinalDemo();
		System.out.println(d.x);
		d.display();
		System.out.println(d.x);

	}

	
}
