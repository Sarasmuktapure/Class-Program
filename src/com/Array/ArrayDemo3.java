package com.Array;

public class ArrayDemo3 {
	public static char maxChar(char[]c)
	{
		char mchar=c[0];
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+"  "+((int)c[i]));
			if(mchar<c[i])
			{
				mchar=c[i];
			}
		}
		//System.out.println(mchar);
		return mchar;
	}

	public static void main(String[] args)
	{
		char ch[]= {'r','U','Z','v'};
		//ArrayDemo3.maxChar(ch);
		char max=ArrayDemo3.maxChar(ch);
		
		System.out.println(max);

	}

	
}
