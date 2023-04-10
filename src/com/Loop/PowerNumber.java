package com.Loop;

import java.util.Scanner;

public class PowerNumber {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base");
		int b=sc.nextInt();
		
		System.out.println("Enter the exponent");
		int expo=sc.nextInt();
		
		int i=1;
		int power=1;
		while(i<=expo)
		{
			power=power*b;
			i++;
		}
		System.out.println(power);

	}


}
