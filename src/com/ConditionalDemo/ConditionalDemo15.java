package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo15 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		System.out.println("Enter the weight");
		int wt=sc.nextInt();
		
		if(age>=18)
		{
			if(wt>=50)
			{
				System.out.println("Eligible for blood donation");
			}
			else
			{
				System.out.println("Weight is less try next time....!!!");
			}
			
		}
		else
		{
			System.out.println("Not elegible");
		}
	}


}
