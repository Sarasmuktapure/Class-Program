package com.Array;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args)
	{
		int a[][]=new int [4][4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter aaray elements");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("-------------------------------------------");
		
		for(int x[]:a)
		{
			for(int n:x)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==0 || j==0 || i==a.length-1 || j==a.length-1)
				{
					System.out.print(a[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	

}
