package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		if(num1>num2)
		{
			System.out.println("First number is greater="+num1);
			
		}
		else
		{
			System.out.println("Second number is greater="+num2);
		}
		
		
		
		

	}


}
