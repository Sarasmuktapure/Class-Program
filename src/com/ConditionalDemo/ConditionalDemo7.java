package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo7 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double num=sc.nextDouble();
		
		String result=(num>0.0)?"It is positive number":(num<0.0)?"It is negative number":"It is zero";
		System.out.println(result);
		

	}

}
