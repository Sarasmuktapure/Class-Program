package com.String;

import java.util.Scanner;

public class DuplicateWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String s[]=str.split(" ");
		for(int i=0;i<s.length;i++)
		{
			int count=1;
			boolean isVisited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(s[i].equals(s[k]))
				{
					isVisited=true;
					break;
				}
			}
			if(isVisited==false)
			{
				for(int j=i+1;j<s.length;j++)
				{
					if(s[i].equals(s[j]))
					{
						count++;
					}
				}
				if(count>1)
				{
				System.out.print(s[i]+" ");
				}
			}
		}
	}
}


