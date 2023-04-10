package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo4 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Entered number is positive");
		}
		else if(num<0)
		{
			System.out.println("Entered number is negative");
		}
		else
		{
			System.out.println("Entered number is niether positive nor negative");
		}

	}


}
