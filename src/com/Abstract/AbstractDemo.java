package com.Abstract;

abstract class Animal{
	abstract void foodType();
	Animal(int legs)
	{
		System.out.println("Animal having " +legs+ " legs.");
	}
}
class Dog extends Animal{
	Dog(int x)
	{
		super(x);
	}
	void foodType() {
		System.out.println("Dog needs dogfood");
	}
}

class Cat extends Animal{
	Cat(int x)
	{
		super(x);
		
	}
	void foodType() {
		System.out.println("Cat needs catfood or milk");
	}
}
public class AbstractDemo {

	public static void main(String[] args)
	{
		//Dog d= new Dog(4);
				Cat c=new Cat(6);
				c.foodType();
				
	}

}
