package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo6 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		double num=sc.nextDouble();
		
		if(num>0.0)
		{
			System.out.println("Entered number is positive");
		}
		else if(num<0.0)
		{
			System.out.println("Entered number is negative");
		}
		else
		{
			System.out.println("Entered number is zero");
		}

	}


}
