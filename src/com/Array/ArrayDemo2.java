package com.Array;

import java.util.Scanner;

public class ArrayDemo2 {
	public static void evenSum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println("sum="+sum);
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("Enter the array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		ArrayDemo2.evenSum(a);
		
		
	}

}
