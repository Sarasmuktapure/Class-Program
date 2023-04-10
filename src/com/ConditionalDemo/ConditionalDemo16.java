package com.ConditionalDemo;

import java.util.Scanner;

public class ConditionalDemo16 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper case");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Lower case");
		}
		else
		{
			System.out.println("Character is not alphabet");
		}

	}


}
