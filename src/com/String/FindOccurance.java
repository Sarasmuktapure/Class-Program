package com.String;

import java.util.Scanner;

public class FindOccurance {
	public static void findOccurance(String s)
	{
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(str[i].equalsIgnoreCase(str[k]))
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<str.length;j++)
				{
					if(str[i].equalsIgnoreCase(str[j]))
					{
						count++;
					}
				}
				System.out.println(str[i]+" "+count);
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		FindOccurance.findOccurance(s);
		

	}

	

}
