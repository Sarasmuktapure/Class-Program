package com.Array;

import java.util.Scanner;

public class Pattern1 {
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
				if(j==0 || j==a.length-1 || i==j )
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
