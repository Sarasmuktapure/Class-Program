package com.String;

import java.util.Scanner;

public class StringReverse {
	public static void reverseString(String s)
	{
		String revstr="";
		for(int i=s.length()-1;i>=0;i--)
		{
			revstr=revstr+s.charAt(i);
		}
		System.out.println(revstr);
		
	}
	public static String stringReverse(String s)
	{
		String strrev="";
		for(int i=0;i<s.length();i++)
		{
			strrev=s.charAt(i)+strrev;
		}
		//System.out.println(strrev);
		return strrev;
	}
	
	public static void charString(char []ch)
	{
		char temp[]=new char[ch.length];
		for(int i=ch.length-1;i>=0;i--)
		{
			temp[i]=ch[i];
			System.out.println(temp[i]);
			
		}
	
		
		}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		StringReverse.reverseString(s);
		//StringReverse.stringReverse(s);
		System.out.println(StringReverse.stringReverse(s));
		System.out.println("--------------------------------------------");
		char ch[]=s.toCharArray();
		
		StringReverse.charString(ch);
		
		

	}


}
