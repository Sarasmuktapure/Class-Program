package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo11 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		
		if(age>=18)
		{
			System.out.println("Eligible for driving license");
		}
		else
		{
			System.out.println("Not Eligible for driving license");
		}
		 
		
		
		

	}

}
