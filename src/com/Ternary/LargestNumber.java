package com.Ternary;

import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		String result=(num1>num2)?"num1 is largest":"num2 is largest";
		System.out.println(result);
		
		int max=(num1>num2)?num1:num2;
		System.out.println(max);


	}


}
