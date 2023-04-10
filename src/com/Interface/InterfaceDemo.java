package com.Interface;

interface Printable{
	public static final int x=10;
	void print();
}

class MyDocument implements Printable{
	@Override
	public void print() {
		System.out.println("Document is printed..");
		
	}
}

public class InterfaceDemo {

	public static void main(String[] args) 
	{
		Printable p=new MyDocument();
		p.print();
		System.out.println(p.x);

	}

}

