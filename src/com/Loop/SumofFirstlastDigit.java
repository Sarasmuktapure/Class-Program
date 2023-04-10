package com.Loop;

import java.util.Scanner;

public class SumofFirstlastDigit {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int last=num%10;
		int first=0;
		
		while(num>0)
		{
			 first=num%10;
			 num=num/10;
			
		}
		int sum=first+last;
		System.out.println("Sum of first and last didgit is:");
		System.out.println(sum+" ");
		

	}


}
