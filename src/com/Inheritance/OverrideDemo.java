package com.Inheritance;

class Fruit{
	String test;
	void checkTest(int x)
	{
		System.out.println("Test is yummy....");
	}
}

class Banana extends Fruit{
    @Override
	void checkTest(int x)
	{
    	System.out.println("It's sweet");
	}
}


public class OverrideDemo {

	public static void main(String[] args) {
		Fruit f=new Banana();
		Fruit f1=new Fruit();
		f.checkTest(10);
		f1.checkTest(10);

	}

}
