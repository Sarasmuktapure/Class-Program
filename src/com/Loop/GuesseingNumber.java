package com.Loop;

import java.util.Scanner;

public class GuesseingNumber {
	public static void main(String[] args) 
	{
		int magicnumber=56;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter number for gusseing");
			int num=sc.nextInt();
			
			if(num>magicnumber)
			{
				System.out.println("Number is greater plz try again.....");
				continue;
			}
			else if(num<magicnumber)
			{
				System.out.println("Number is less plz try again.....");
				continue;
			}
			else
			{
				System.out.println("Gusseing number is correct.....");
				break;
			}
		}
		
		
		
		
		
		

	}

}
