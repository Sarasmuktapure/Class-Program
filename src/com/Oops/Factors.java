package com.Oops;

public class Factors {

	public void calculateFactors(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			System.out.print(i+" ");	
		
	    }
		
	}
	

	public static void main(String[] args)
	{
		Factors f=new Factors();
		f.calculateFactors(60);
		
		

	}


}
