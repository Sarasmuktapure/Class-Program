package com.Array;

import java.util.Arrays;

public class ToggleDemo {
	public static void main(String[] args)
	{
		char ch[]= {'t','i','A','g','L'};
		System.out.println(Arrays.toString(ch));
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		System.out.println(Arrays.toString(ch));
	}


}
