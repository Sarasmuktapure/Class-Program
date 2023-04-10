package com.Oops;

class Rectangle
{
	int length,breath;
	Rectangle()
	{
		length=8;
		breath=6;
	}
	Rectangle(int x)
	{
		length=x;
		breath=15;
	}
	Rectangle(int x,int y)
	{
		length=x;
		breath=y;
	}
	float getData()
	{
		
		return(length*breath);
	}
	
}
public class ConstructorOverloading {

	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(20);
		Rectangle r3=new Rectangle(30,21);
		
		System.out.println("Area of first rectangle is:"+r1.getData());	
		System.out.println("Area of second rectangle is:"+r2.getData());	
		System.out.println("Area of third rectangle is:"+r3.getData());	
		System.out.println("Main Method");

	}

}

