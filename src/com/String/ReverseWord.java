package com.String;

import java.util.Scanner;

public class ReverseWord {
	public static void reverseWord(String s)
	{
		String []str=s.split(" ");
		String revstr="";
		
		for(int i=0;i<str.length;i++)
		{
			String word=str[i];
			String wordrev="";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				wordrev=wordrev+word.charAt(j);
			}
			revstr=revstr+wordrev+" ";
			
		}
		System.out.println(revstr);
		
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		ReverseWord.reverseWord(s);
    }


}
