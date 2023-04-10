package com.Oops;

public class CarInfo {
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.setID(12345);
		c.setName("MARUTI SUZUKI");
		c.setPrice(1500000);
		c.setColour("Red");
		
		System.out.println(c.getId()+" "+c.getName()+" "+c.getPrice()+" "+c.getColour());

	}


}
