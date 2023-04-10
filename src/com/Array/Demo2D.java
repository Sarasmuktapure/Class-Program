package com.Array;

import java.util.Scanner;

public class Demo2D {
	public static void main(String[] args)
	{
		//int a[][]= {{4,5,6},{3,7,8},{1,2,3}};
		int a[][]=new int[3][3];
		System.out.println("Enter the array elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				
			}
			
		}
		System.out.println("--------------------------------------");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
			
		}
		System.out.println("--------------------------------");
		
		for(int x[]:a)
		{
			for(int n:x)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		

	}


}
