package com.Loop;

import java.util.Scanner;

public class CheckBinary {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		boolean isbinary=true;
		while(num>0) 
		{
			int digit=num%10;
			if(digit!=0 && digit!=1)
			{
			  isbinary=false;
			  break;
			}
			else
			{
				num=num/10;
			}
			
		}
			
		if(isbinary==true) 
			{
				System.out.println("It is binary number");
			}
			else
			{
				System.out.println("It is not binary number");
			}
		}


}
