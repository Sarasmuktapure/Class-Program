package com.Array;

public class Pattern2 {
	public static void main(String[] args) 
	{ 
		char a[][]=new char[4][4];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==0  || j==0 || i==a.length-1 || j==a.length-1 )
				{
					a[i][j]='*';
				}
				else
				{
					a[i][j]=' ';
				}
			}
		}
		//System.out.println("-------------------------------------------------");
		
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


