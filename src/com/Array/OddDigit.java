package com.Array;

import java.util.Scanner;

public class OddDigit 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		System.out.println("Odd digits are");
		while(num>0)
		{
			int digit=num%10;
			if(digit%2!=0)
			{
				System.out.print( +digit+ "\n");
			}
			num=num/10;
		}
		if(num%2==0)
		{
			System.out.println("No odd digits");
		}
		
		

	}

}
