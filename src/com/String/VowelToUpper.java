package com.String;

import java.util.Scanner;

public class VowelToUpper {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' || ch[i]=='u' )
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		str=new String(ch);
		System.out.println(str);
		
	}

}
