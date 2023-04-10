package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo8 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		String result=(num%2==0)?"Number is even":"Number is odd";
		System.out.println(result);
		

	}


}
