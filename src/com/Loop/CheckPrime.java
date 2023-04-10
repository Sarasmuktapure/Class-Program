package com.Loop;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int i=2;
		boolean isprime=true;
		while(i<num)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			i++;
		}
		if(isprime==true)
		{
			System.out.println("It is prime number");
			
		}
		else
		{
			System.out.println("It is not prime number");
		}

	}


}
