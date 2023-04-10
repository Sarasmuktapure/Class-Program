package com.Switch;

import java.util.Scanner;

public class ForLoopDemo4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
			
		}
		System.out.println("The factorial of given number is:");
		System.out.println(fact+" ");

	}


}
