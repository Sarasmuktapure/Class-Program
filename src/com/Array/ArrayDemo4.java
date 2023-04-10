package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		int[]a= {5,7,2,3,9};
		System.out.println(Arrays.toString(a));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element for searching...");
		int num=sc.nextInt();
		
		boolean ispresent=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				ispresent=true;
			}
		}
		if(ispresent)
		{
			System.out.println("Present");
		}
		else
		{
			System.out.println("Not Present");
		}


	}

}
