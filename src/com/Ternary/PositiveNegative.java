package com.Ternary;

import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		
		String ans=(num1>0)?"positive":(num1<0)?"negative":"zero";
		System.out.println(ans);
		

	}


}
