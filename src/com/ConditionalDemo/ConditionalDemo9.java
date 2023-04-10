package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo9 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter the third number");
		int num3=sc.nextInt();
		
		String result=((num1>num2) && (num1>num3))?"First number is largest":((num2>num1) && (num2>num3))?"Second number is largest":"Third number is largest";
		
		System.out.println(result);
		

	}

}
