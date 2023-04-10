package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo5 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%3==0)
		{
			System.out.println("Entered number is divisible by 3");
		}
		else
		{
			System.out.println("Entered number is not divisible by 3");
		}
			
		

	}

}
