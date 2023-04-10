package com.Inheritance;

class Vehical2{
	Vehical2(String name)
	{
		System.out.println(name);
	}
}

class Bike extends Vehical2{
	Bike()
	{
		super("Shine");
		System.out.println("Vehical is Bike.......");
	}
}

public class SuperDemo2 {

	public static void main(String[] args) {
		Bike b=new Bike();
		

	}

}

