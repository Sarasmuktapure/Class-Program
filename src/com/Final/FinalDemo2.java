package com.Final;

public class FinalDemo2 {
	static final int x;
	static
	{
		x=20;
	}

	void display()
	{
		System.out.println(x);
	}
	public static void main(String[] args) 
	{
		FinalDemo2 d2=new FinalDemo2();
		//System.out.println(d2.x);
		d2.display();

	}


}
