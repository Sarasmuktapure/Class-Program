package com.Inheritance;

class Vehical{
	int wheels;
	void run()
	{
		System.out.println("Vehical is running....");
	}
}

class Car extends Vehical{
	int wheels=4;
	public void showCar()
	{
		System.out.println(super.wheels+" "+this.wheels);
		super.run();
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		Car c=new Car();
		c.showCar();

	}

}
