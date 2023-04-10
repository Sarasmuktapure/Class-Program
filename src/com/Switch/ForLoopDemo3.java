package com.Switch;

public class ForLoopDemo3 {
	public static void main(String[] args) 
	{
		System.out.println("The even numbers are:");
		int sum=0;
		for(int i=1; i<=10; i++)
		{
			if(i%2==0) 
			{
				sum=sum+i;
				System.out.println(i+" ");
			}
			
			
		}
		System.out.println("The sum of these numbers is:");
		System.out.println(sum+" ");

	}


}
