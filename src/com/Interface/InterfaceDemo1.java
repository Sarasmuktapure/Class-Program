package com.Interface;

interface Showable{
	public static final int x=10;
	void print();
	
}

interface Drawable{
	void draw(String name);
}

class MyClass implements Showable,Drawable{
	public void print()
	{
		System.out.println("Document is printed..");
	}
	
	public void draw(String name)
	{
		System.out.println("Draw shape is..."+name);
	}
	
}

public class InterfaceDemo1 {

	public static void main(String[] args)
	{
		Showable s=new MyClass();
		s.print();
		System.out.println(s.x);
		
		Drawable d=new MyClass();
		d.draw("Circle");
	

	}

}
