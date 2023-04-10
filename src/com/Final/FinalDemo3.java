package com.Final;

class Car
{
	final void speedLimit()
	{
		System.out.println("Car speed is not allowed above 50kmphr");
	}
}
class BMW extends Car
{
	void showBmw()
	
	{
		System.out.println("This is BMW car");
	}
}

public class FinalDemo3 {
	

	public static void main(String[] args) 
	{
		BMW b=new BMW();
		b.speedLimit();
		b.showBmw();

		

	}

}
