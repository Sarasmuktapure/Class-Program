package com.Loop;

public class WhileLoop3 {
	public static void main(String[] args)
	{
		int i=1;
		int sum=0;
		System.out.println("The even numbers are:");
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i+" ");
		        sum=sum+i;
			}
			
			i++;
		}
		
		System.out.println("The sum of these even numbers are:");
		System.out.println(sum+" ");

	}


}
