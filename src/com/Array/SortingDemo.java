package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingDemo {
	public static void sortarray(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int []arr=new int [size];
		System.out.println("Enter the element of array");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		SortingDemo.sortarray(arr);
		System.out.println(Arrays.toString(arr));
		

	}


}
