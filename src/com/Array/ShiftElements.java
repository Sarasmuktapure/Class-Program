package com.Array;

import java.util.Arrays;

public class ShiftElements {
	public static void shiftZeros(int[]a)
	{
		int j=a.length;
		int k=0;
		for(int i=0; i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[k]=a[i];
				k++;
			}
		}
		while(k<a.length)
		{
			a[k]=0;
			k++;
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		int[]a= {4,0,6,7,0,3,0};
		ShiftElements.shiftZeros(a);

	}

}
