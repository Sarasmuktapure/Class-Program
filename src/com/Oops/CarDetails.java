package com.Oops;

public class CarDetails {
	String name;
	String colour;
	float price;
	
	void acceptDetails(String n,String c,float p)
	{
		
		name=n;
		colour=c;
		price=p;
				
	}
	void showDetails() 
	{
		
		System.out.println("Car name is:"+name);
		System.out.println("Car colour is:"+colour);
		System.out.println("Car price is RS:"+price);
		
		
	}
	

	public static void main(String[] args) 
	{
		CarDetails car1=new CarDetails();
		car1.acceptDetails("Maruti Suzuki","Red",1045000);
		car1.showDetails();
		
		CarDetails car2=new CarDetails();
		car2.acceptDetails("TATA Innova","White",1800000);
		car2.showDetails();
		
		CarDetails car3=new CarDetails();
		car3.acceptDetails("BMW","Black",4500000);
		car3.showDetails();
		

	}


}
