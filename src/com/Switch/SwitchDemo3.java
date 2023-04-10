package com.Switch;

import java.util.Scanner;

public class SwitchDemo3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city name");
		String city=sc.next();
		
		switch(city)
		{
		   case "pune":System.out.println("I like pune");
			break;
		   
		   case "mumbai":System.out.println("I like mumbai");
		   break;
		   
		   default:System.out.println("Invalid input");
		}

	}
	

}
