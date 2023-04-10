package com.Loop;

import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int reverse=0;
		while(num>0)
		{
			int r=num%10;
			reverse=r+reverse*10;
			num=num/10;
		}
		System.out.println("Reverse of given number is:");
		System.out.println(reverse+" ");

	}


}
