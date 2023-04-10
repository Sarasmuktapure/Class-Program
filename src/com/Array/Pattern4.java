package com.Array;

public class Pattern4 {
	public static void main(String[] args)
	{
		char a[][]=new char[4][4];
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				a[i][j]='*';
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();

	}

}

}
