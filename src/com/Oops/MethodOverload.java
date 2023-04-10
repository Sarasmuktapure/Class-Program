package com.Oops;

public class MethodOverload {
	public void Area(double r)
	{
		
		System.out.println("Area of circle is="+(3.14*r*r));
	}
	public void Area(int l, int b)
	{
		System.out.println("Area of rectangle is="+(l*b));
	}
	public void Area(int s)
	{
		System.out.println("Area of square is="+(s*s));

	}
	
	public void Area(float b, float h)
	{
		System.out.println("Area of triangle is="+(b*h)/2);

	}

	public static void main(String[] args) 
	{
		MethodOverload m=new MethodOverload();
		
		m.Area(7, 5);
		m.Area(5);
		m.Area(7d);
		m.Area(6.5f, 8.5f);
		

	}


}
